# text_file_processing
## Task
<img src="https://user-images.githubusercontent.com/85234616/122801662-1527f180-d2cd-11eb-9134-8c133d40764f.jpg" width="500">

<img src="https://user-images.githubusercontent.com/85234616/122801701-22dd7700-d2cd-11eb-908d-e45d88bbf69e.jpg" width="500">

## Solution

In **main** method we call method **rarestWords** and pass file address to it. 

<img width="812" alt="Снимок экрана 2021-06-21 в 20 18 58" src="https://user-images.githubusercontent.com/85234616/122802480-1279cc00-d2ce-11eb-85f8-5bde82926227.png">

In **rarestWords** method we call method **findWords** which returns Map with words in our file and their amount(value). By the **Collections.min** method we find the number of the rarest words. Then in Map we find words with minimal value.

<img width="401" alt="Снимок экрана 2021-06-21 в 20 35 53" src="https://user-images.githubusercontent.com/85234616/122804371-84ebab80-d2d0-11eb-85d9-07ff618b07c1.png">

In **findWords** method we use **FileReader** and **BufferedReader** to read information from file. Using regular expressions we remove unnecessary characters and create Map with words and their amount.

<img width="496" alt="Снимок экрана 2021-06-21 в 21 10 28" src="https://user-images.githubusercontent.com/85234616/122808149-283ebf80-d2d5-11eb-8a5a-58fb425e24c7.png">

<img width="563" alt="Снимок экрана 2021-06-21 в 21 10 41" src="https://user-images.githubusercontent.com/85234616/122808169-2f65cd80-d2d5-11eb-8c2b-766eaae526ae.png">



## Result

<img width="209" alt="Снимок экрана 2021-06-21 в 21 24 03" src="https://user-images.githubusercontent.com/85234616/122809634-08a89680-d2d7-11eb-9455-5a11b30d6e81.png">
<img width="358" alt="Снимок экрана 2021-06-21 в 21 23 20" src="https://user-images.githubusercontent.com/85234616/122809572-f3cc0300-d2d6-11eb-813d-75d7169a322d.png">

