package behavioral.command.impl;

 /*
 Klasa reprezentuje klase Invoker na diagramie klas UML
 to wlasnie ta klasa wysyla żadanie do innego obiektu - żądanie wykonania jakiejś operacji
 aby uniknac bezposredniego odwolania przykladowo w przypadku kopiowania do CopyService, wrowadzamy pewnego
 posrednika (Command) - nasz kod jest bardziej elastyczny
*/

public class TextOperationService {

    private Command command;

    public TextOperationService(Command command) {
        this.command = command;
    }

    // Metoda moze reprezentowac klikniecie przycisku
    public void doOperation() {
        command.execute();
    }
}
