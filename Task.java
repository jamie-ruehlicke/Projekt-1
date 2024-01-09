import java.util.ArrayList;
import java.time.LocalDateTime;

public class Task {
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String taskDescription;
    private int priority;
    private int id;
    private ArrayList<Task> preTask = new ArrayList<Task> ();
    private Person owner;
    private String status;



    public Task() {}

    public Task(LocalDateTime endDate , String taskDescription , int priority , int id , Person owner) {
        this.endDate = endDate;
        this.taskDescription = taskDescription;
        this.priority = priority;
        this.id = id;
        this.owner = owner;
        this.status = "Noch nicht begonnen";
    }

    public Task(LocalDateTime startDate , LocalDateTime endDate , String taskDescription , int priority ,
                int id , ArrayList<Task> preTask , Person owner) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.taskDescription = taskDescription;
        this.priority = priority;
        this.id = id;
        this.preTask = preTask;
        this.owner = owner;
        this.status = "Noch nicht begonnen";
    }

    public Task(LocalDateTime startDate , LocalDateTime endDate , String taskDescription , int priority ,
                int id , ArrayList<Task> preTask , Person owner , String status) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.taskDescription = taskDescription;
        this.priority = priority;
        this.id = id;
        this.preTask = preTask;
        this.owner = owner;
        this.status = status;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        if (startDate.isBefore ( this.endDate )) {
            this.startDate = startDate;
        }
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        if (endDate.isAfter ( this.startDate )) {
            this.endDate = endDate;
        }
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority >= 1 && priority <= 10) {
            this.priority = priority;
        }
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        if (this.id != 0) {
            throw new UnsupportedOperationException ( "ID kann nicht geändert werden." );
        }
        this.id = id;
    }

    public ArrayList<Task> getPreTask() {
        return preTask;
    }

    public void setPreTask(ArrayList<Task> preTask) {
        this.preTask = preTask;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        if (this.owner == null) {
            this.owner = owner;
        } else {
            throw new UnsupportedOperationException ( "Der Owner kann nicht verändert werden" );
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status , String userRole) {
        if (userRole.equals ( "Owner" )) {
            this.status = status;
        } else {
            System.out.println ( "Nur der Owner kann den Status ändern." );
        }
    }

    public boolean alleVorgaengerErfuellt() {
        if (alleVorgaengerErfuellt ()) {
            return true;
        } else {
            return false;
        }
    }

    public void addPreTask(Task task) {
        this.preTask.add ( task );
    }

    public void removePreTask(Task task) {
        this.preTask.remove ( task );
    }

    public void updatePreTask(Task oldTask , Task newTask) {
        int index = this.preTask.indexOf ( oldTask );
        if (index != -1) {
            this.preTask.set ( index , newTask );
        } else {
            System.out.println ( "Task not found in preTask list" );
        }
    }

    public boolean conditionMet() {
        return true;
    }
    public void removePreTaskIfConditionMet(Task task) {
        if (conditionMet()) {
            this.preTask.remove(task);
        } else {
            System.out.println("Condition not met");
        }
    }
}



