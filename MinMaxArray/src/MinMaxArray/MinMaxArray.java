package MinMaxArray;
public class MinMaxArray
{
private int[] pippo;
/*costruisce un oggetto della classe MinMaxArray
@param unVettore il vettore che l'oggetto deve contenere*/
public MinMaxArray(int[] unVettore)
{
pippo = new int[unVettore.length];
System.arraycopy(unVettore, 0, pippo, 0, unVettore.length);
}
/*restituisce il valore massimo contenuto nell'array
@return il valore massimo contenuto nell'array*/
public int getLength() 
{
	int a = pippo.length;
	return a;
}
public int getMax()
{
int massimo = pippo[0];
for(int i= 1; i < pippo.length; i++)

{
if(massimo <= pippo[i])
massimo = pippo[i];
}
return massimo;
}
/*restituisce il valore minimo contenuto nell'array
@return il valore minimo contenuto nell'array*/
public int getMin()
{
int minimo = pippo[0];
for(int i= 1; i< pippo.length; i++)
{
if(minimo>= pippo[i])
minimo = pippo[i];
}
return minimo;
}
}