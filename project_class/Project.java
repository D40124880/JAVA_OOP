public class Project{
    private String name;
    private String description;

    public Project() {
        // getters and setters
        createProject("No name", "No Description");
    }

    public Project(String name) {
        // getters and setters
        createProject(name, "No Description");
    }

    public Project(String name, String description) {
        // getters and setters
        createProject(name, description);
    }

    public void createProject(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String elevatorPitch() {
        return this.name + " : " + this.description;
    }
}
