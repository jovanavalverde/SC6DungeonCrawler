public class displayMessage {

    private String[] battleMessage = {

            "What will you do?",
            "You attack for %d damage!",
            "%s attacks you for %d damage!",
            "You use a health potion and restore %d health!",
            "You use a mana potion and restore %d mana!"

    };

    public String getMessage(int index){

        return battleMessage[index];

    }

}
