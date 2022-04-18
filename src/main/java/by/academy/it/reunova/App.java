package by.academy.it.reunova;

import by.academy.it.reunova.entity.HomeTask;
import by.academy.it.reunova.entity.Person;
import by.academy.it.reunova.entity.WorkTask;
import by.academy.it.reunova.util.HibernateUtil;

import javax.persistence.EntityManager;

public class App {
    public static void main(String[] args) {
        HomeTask homeTask = HomeTask.builder()
                .startDate("13-01-2003")
                .endDate("24-04-2003")
                .executor(new Person("Ваня", "Иванов"))
                .watcher(new Person("Петя", "Петров"))
                .build();
        homeTask.setNameTask("Задача №5");
        homeTask.setDescription("Решить уравнение");

        WorkTask workTask = WorkTask.builder()
                .cost(2.25)
                .build();
        workTask.setNameTask("Задача №7");
        workTask.setDescription("Решить задачу");

        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(homeTask);
        entityManager.persist(workTask);
        entityManager.getTransaction().commit();

        entityManager.close();
        HibernateUtil.close();
    }
}
