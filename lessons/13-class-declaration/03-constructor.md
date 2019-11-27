Конструктор - это специальный метод вызываемый при создании экземпляра класса. Т.е. когда, кто-то, где-то в программе применяет оператор new.  

Задача конструктора, инициализировать состояние объекта и подготовить его к использованию. 

Объявление конструктора состоит из модификатора доступа и имени класса. Конструктор может принимать параметры, как любой другой метод. Если параметр коструктора имеет такое же имя как имя поля класса, то для доступа к полю класса используется префикс this. This - это ссылка на текущий экземпляр, в контексте которого исполняется конструктор или любой другой метод. Обычно явно писать this не нужно, но в случае конфликта имен поля и локальной переменной или параметра, приходиться это делать. 

Когда в классе не объявлен ни один конструктор, то неявно создается конструктор по умолчанию, без параметров. Т.е. даже если в классе нет конструктора, его экземпляр все равно можно создать при помощи new. 

Если нужно запретить создание экземпляров класса, то нужно сделать конструктор приватным. 

В классе может быть несколько перегруженных конструкторов с разными наборами параметров. При этом из одного конструктора можно вызывать другой. Эмуляция параметров по умолчанию. 