public class StudentServiceImpl implements StudentService{
    private Group group = new Group();
    @Override
    public void saveStudent(Student student) {
    }

    @Override
    public Student getById(Long id) {
        for (Student student : group.getList()) {
            if (student.getAge() == id) {
                return student;
            }
        }
        return null;
    }

}
