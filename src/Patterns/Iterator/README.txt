Итератор — это поведенческий паттерн, позволяющий последовательно обходить сложную коллекцию, без раскрытия деталей её реализации.

Благодаря Итератору, клиент может обходить разные коллекции одним и тем же способом, используя единый интерфейс итераторов.

В данном примере я реализовал интерфейс Iterable создав собственный итератор брони в классе ArmorIterator
Если проводить аналогии, то класс Equipment представляет из себя коллекцию, а объекты имплементирующие интерфейс EquipmentPart
элементы данной коллекции.

В примере реализован подсчет с помощью Итератора показателя комплекта брони надетого полностью или частично.
Более подробно можно почитать тут:
https://javarush.ru/groups/posts/1884-pattern-iterator


