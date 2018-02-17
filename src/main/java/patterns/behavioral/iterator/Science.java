package patterns.behavioral.iterator;


import java.util.LinkedList;

public class Science implements ISubject {

    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<String>();
        subjects.add("Maths");
        subjects.add("Comp");
        subjects.add("Physics");
    }

    @Override
    public IIterator createIterator() {
        return new ScienceIterator(subjects);
    }

    private class ScienceIterator implements IIterator {
        private LinkedList<String> subjects;
        private int position;

        public ScienceIterator(LinkedList<String> subjects) {
            this.subjects = subjects;
            position = 0;
        }

        @Override
        public void First() {
            position = 0;
        }

        @Override
        public String Next() {
            return subjects.get(position++);
        }

        @Override
        public Boolean IsDone() {
            return position >= subjects.size();
        }

        @Override
        public String CurrentItem() {
            return subjects.get(position);
        }
    }
}
