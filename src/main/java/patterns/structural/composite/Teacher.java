package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

class Teacher implements ITeacher {

 private String teacherName;
 private String deptName;
 private List<ITeacher> controls;

 public Teacher(String teacherName, String deptName) {

  this.teacherName = teacherName;
  this.deptName = deptName;
  controls = new ArrayList<ITeacher>();

 }

 public void Add(Teacher teacher) {
  controls.add(teacher);
 }

 public void Remove(Teacher teacher) {
  controls.remove(teacher);
 }

 public List<ITeacher> getControllingDepts() {
  return controls;
 }

 public String getDetails() {
  return (teacherName + " is the " + deptName);
 }
}
