package by.academy.it.reunova;

import by.academy.it.reunova.entity.HomeTask;
import by.academy.it.reunova.entity.Person;
import by.academy.it.reunova.entity.WorkTask;
import by.academy.it.reunova.util.HibernateUtil;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;

public class AppTest {

    @Test
    public void test1() {
        HomeTask homeTask = HomeTask.builder()
                .startDate("01-01-2001")
                .endDate("02-02-2002")
                .executor(new Person("Дима", "Дмитров"))
                .watcher(new Person("Федя", "Федоров"))
                .build();
        homeTask.setNameTask("Задача №1");
        homeTask.setDescription("Решить 2+2");

        WorkTask workTask = WorkTask.builder()
                .cost(3.70)
                .build();
        workTask.setNameTask("Задача №2");
        workTask.setDescription("Решить 2*2");

        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(homeTask);
        entityManager.persist(workTask);
        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();
        HomeTask homeTaskEntity = entityManager.find(HomeTask.class, homeTask.getId());
        WorkTask workTaskEntity = entityManager.find(WorkTask.class, workTask.getId());
        Assert.assertEquals(homeTask, homeTaskEntity);
        Assert.assertEquals(workTask, workTaskEntity);
        entityManager.getTransaction().commit();

        entityManager.close();
        HibernateUtil.close();
    }
}
