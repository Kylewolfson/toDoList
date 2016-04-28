import java.util.ArrayList;
import java.time.LocalDateTime;

public class Category {
  private String mName;
  private int mId;
  private static ArrayList<Category> instances = new ArrayList<Category>();
  private ArrayList<Task> mTasks;


public Category(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
    mTasks = new ArrayList<Task>();
}

  public String getName() {
    return mName;
  }

  public static ArrayList<Category> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }

  public static void clear() {
    instances.clear();
  }

  public ArrayList<Task> getTasks() {
    return mTasks;
  }

  public static Category find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public void addTask(Task task) {
    mTasks.add(task);
  }
}
