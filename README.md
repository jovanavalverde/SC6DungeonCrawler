# SC6DungeonCrawler

Runtime:
--module-path "./lib" --add-modules javafx.controls,javafx.fxml

How to get rid of the red imports and errors:
1. Click on the cog wheel in the top right(sometimes looks like yellow up arrow).
2. Then open project structure.
3. Open the libraries tab on the left.
4. Press the plus sign at the top, then the java option.
5. From there you want to open your project file by clicking the little arrow next to 
   the name.(for me, it's called SC6DungeonCrawler-1)
6. Then select the lib folder within the project file, and click OK. (You may get a few pop-ups, just 
   click yes or OK, and it should be fine)
7. Then click apply and OK.
8. All red imports and run errors should be corrected.


How to Run the application properly:
1. First copy everything within the following parenthesis ( --module-path "./lib" --add-modules javafx.controls,javafx.fxml ).
2. Next click on the drop-down list between the hammer and triangle at the top of your screen.
3. Click edit Configurations. 
4. Next click the plus in the top left, and select the "Application" option. You can name the configuration whatever you want.
5. In the Main class slot, type in (Main).
6. Then click the "Modify options" button, followed by the "Add VM Options".
7. Paste the previously copied text into the VM options slot and apply the settings.
8. Click OK and then run the project it while the new configuration is selected in the drop-down.