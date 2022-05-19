package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenCompatorDescByNameAndDescPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorAscByNameAndAscPrority() {
        Comparator<Job> cmpAscNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpAscNamePriority.compare(
                new Job("Ñontinuation prog", 0),
                new Job("Finish all", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorDescByNameAndAscPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Going back", 0),
                new Job("Start again", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobDescByName() {
        Comparator<Job> cmpDeskByName = new JobDescByName();
        int rsl = cmpDeskByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobAscByName() {
        Comparator<Job> cmpAscByName = new JobAscByName();
        int rsl = cmpAscByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenJobDescByPriority() {
        Comparator<Job> cmpDeskByPriority = new JobDescByPriority();
        int rsl = cmpDeskByPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenJobAscByPriority() {
        Comparator<Job> cmpAscByPriority = new JobAscByPriority();
        int rsl = cmpAscByPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}