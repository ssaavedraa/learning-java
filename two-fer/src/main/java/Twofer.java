public class Twofer {
    public String twofer(String name) {
        String newName = name == null || name.isEmpty() ? "you" : name;
            
        return String.format("One for %s, one for me.", newName);
    }
}
