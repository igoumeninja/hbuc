/*

Aris Bezas 1 - 11- 11
Travel Igoumenitsa - Kerkyra.
Un cruzero mas.

Με το συγκεκριμένο πρότυπο θέλω να δημιουργήσω μια μηχανή που θα δημιουργεί ρομπότ τα οποία θα στέλνουν OSC μηνύματα στο openFrameworks. Tα μηνύματα αυτά θα έχουν αρχικά το συντακτικό:

OF.writeString("string",100,100,255,255,255,255);	//	("takis", Xpos, Ypos, R, G, B, A); 

Με το συγκεκριμένο πρότυπο θα μπορεί ο χρήστης να δημιουργεί φράσεις.

Η αρχική εφαρμογή έγινε χρησιμοποιόντας Task

~typo = Task({
	var xPos, yPos = 20, count = 0;
	11500.do	{|i|
		xPos = 8*count;
		0.01.wait;
		if (xPos > ~width, {xPos = 0; count = 0; yPos = yPos +15} );
		count = count + 1;			
	}
});
~typo.play;

Συγκεκριμένα το παραπάνω Task εκτυπώνει ένα κείμενο γράμμα προς γράμμα σαν να το γράφει χέρι.


Typo {
	
	*init {
		Task({
			var xPos, yPos = 20, count = 0;
			11500.do	{|i|
				xPos = 8*count;
				0.01.wait;
				if (xPos > ~width, {xPos = 0; count = 0; yPos = yPos +15} );
				count = count + 1;			
			}
		})	
	}
}
*/