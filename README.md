## Бутаков Никита Сергеевич РИ-220932
## Задание 2 Web Service

Дз по теме Web Service:
почитать про webapplicationcontext и про маппинги (какие бывают и какие у них параметры)
реализовать два контроллера. 
Один контроллер должен в качестве ответа на GET запрос отдавать ответ, в котором выводится список всех заголовков запроса.
Второй контроллер должен принимать на вход JSON вида:
{
    "price": 125.0,
    "info": {
        "date": "2022-01-01"
    } 
}

и отдавать его обратно при этом добавить в ответ свойство id:
{
    "price": 125.0,
    "info": {
        "id": 123,
        "date": "2022-01-01"
    } 
}

написать обработчик ошибок, который будет возвращать кастомную 502 ошибку
