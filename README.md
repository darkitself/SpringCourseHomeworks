Глебова Дарья, группа РИ-220941, преподаватель -- Калугин Евгений
Дз по лекции БД:
1) создать контроллер, в котором:
 
endpoint, который на вход будет принимать данные и сохранять их в базу
{
    "name": "Мой список дел",
    "events": ["дело1", "delo2", "delo3"]
}

 
endpoint, который будет отдавать данные из бд в виде:
[
      {
        "name": "Мой список дел",
        "events": ["дело1", "delo2", "delo3"]
    },
    {
        "name": "Мой список дел2",
        "events": ["дело1", "delo2", "delo3"]
    }
]

2) спроектировать структуру БД для этих данных. В качестве БД можно взять любую 