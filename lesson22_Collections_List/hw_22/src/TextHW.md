1. Скопировать репозиторий hw22. https://github.com/codeIt30/HW22
2. Напишите программу для хранения дел. Суть программы:
   Пользователь вводит одну из команд, и программа выполняет требуемое действие.

Какие действия должна уметь выполнять программа:
1. Добавление дела в конец списка дел.
2. Добавление дела на указанное место в списке. Если такого места нет (допустим в списке 3 дела, а хотим добавить на 10) то дело должно быть добавлено в конец списка.
3. Удаление дела по его номеру. Если такого номера в списке нет, ничего не удалять.
4. Изменение дела по заданному номеру.
5. Печать всех дел.

Пример работы программы (ввод пользователя выделен жирным):
Добавить купить помидоры

Добавлено дело: купить помидоры

Добавить сходить в кино

Добавлено дело: сходить в кино

Добавить 1 посмотреть фильм

На 1 место добавлено дело: посмотреть фильм

Добавить 21 купить машину

Нет места под номером 21. Дело купить машину добавлено в конец списка.

Печать

Дело: купить помидоры
Дело: посмотреть фильм
Дело: сходить в кино
Дело: купить машину

Удалить 43

Дела под номером 43 нет

Изменить 2 выпить молока

Дело сходить в кино изменено на выпить молока

Печать

Дело: купить помидоры
Дело: посмотреть фильм
Дело: выпить молока
Дело: купить машину


Совет: Для решения этого задания обратите внимание на регулярные выражения и перегруженный метод split(.., ..).
Перегруз split https://javarush.com/groups/posts/2907-metod-split-v-java-delim-stroku-na-chasti