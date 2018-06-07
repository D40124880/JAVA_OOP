public class ProjectTest {
    public static void main(String[] args){
        Project noInfo = new Project();
        Project withName = new Project("Martin");
        Project withAll = new Project("Giovanni", "Soccer Player!");

        System.out.println(noInfo.elevatorPitch());
        System.out.println(withName.elevatorPitch());
        System.out.println(withAll.elevatorPitch());

        noInfo.setName("New Name");
        System.out.println(noInfo.getName());

        withName.setDescription("I Am A Programmer!");
        System.out.println(withName.elevatorPitch());

        System.out.println(withAll.getDescription());
    }
}
