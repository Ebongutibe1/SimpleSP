# SimpleSP
A simplified way of handling SharedPreferences
//Call Simple SharedPreference
    SSP simplePref;
//Saving text
    simplePref.store("saved",editText.getText().toString());
//Retriving saved text
    String getIt = simplePref.get("saved","");
    editText.setText(getIt);
// It also supports floats,Double,int,booleans etc
//For booleans
simplePref.store("boolean value",true);
//Retrive boolean value
boolean v = simplePref.get("boolean value",false);

Thanks for your time.
Any compliants.. reach me ... ebongutibe@gmail.com
