Создать три класса

1) Task - имеет следующие поля:
- id
- name
- description

2) HomeTask exstends Task - имеет дополнительные поля:
- startDate
- endDate @Embedded
- Исполнитель person (person имеет два поля имя и фамилия сделать Embeddable) @Embedded
- Смотрящий person (person имеет два поля имя и фамилия сделать Embeddable)

3) WorkTask exstends Task - имеет дополнительные поля
- cost

В трех ветках git реализовать 3 стратегии наследования: 
1 - Table per class hierarchy 
2 - Table per subclass 
3 - Table Per Concrete class mapping

Записать туда какие-нибудь данные из main. Проверить через тесты на H2, подключить checkstyle, jacoco.
__________
Create three classes

1) Task - has the following fields:
- id
- name
- description

2) HomeTask exstends Task - has additional fields:
- startDate
- endDate @Embedded
- Performer person (person has two fields first and last name make Embeddable) @Embedded
- Looking person (person has two fields first name and last name make Embeddable)

3) WorkTask exstends Task - has additional fields
- cost

In three git branches, implement 3 inheritance strategies:
1 - Table per class hierarchy
2 - Table per subclass
3 - Table Per Concrete class mapping

Write there some data from main. Check through tests on H2, connect checkstyle, jacoco.
