package behavioral.command;

import behavioral.command.impl.*;

public class Main {

    public static void main(String[] args) {

        // Tworzymy odpowiednie żądania/polecenia
        Command copyCommand = new CopyCommand(new CopyService());
        Command deleteCommand = new DeleteCommand(new DeleteService());

        // Tworzymy obiekt typu invoker
        TextOperationService textService1 = new TextOperationService(copyCommand);
        TextOperationService textService2 = new TextOperationService(deleteCommand);

        // Wykonujemy odpowiednie operacje
        textService1.doOperation();
        textService2.doOperation();
    }
}
