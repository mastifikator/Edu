package Patterns.Proxy;

public class Main {
    public static void main(String[] args) {
        Lord lord = new Lord("Вашество");
        LordAdvisor lordAdvisor = new LordAdvisor("Склизкий");

        lord.replyToRequest("Ваше благородие, мне нужен надел");
        lord.replyToRequest("Дай бабла!");

        //А теперь через прокси
        lordAdvisor.replyToRequest("Победите, пожалуйста, коррупцию");
        lordAdvisor.replyToRequest("Победите, пожалуйста, коррупцию... 500");
    }
}
