import java.math.BigInteger;
public class Diffie_Hellman{

	public static void main(String[] args){
	
		BigInteger g=new BigInteger("3");    //Let g be Generator
		BigInteger n=new BigInteger("17");   //Let p be Prime Modulus
		if (args.length==1){
			BigInteger private_key=new BigInteger(args[0]);  // My Private key 
			BigInteger public_key=g.modPow(private_key,n);    // Public key relevant to my private key
			System.out.println("Public Key: "+ public_key.toString());
		}
		else if(args.length==2){
			BigInteger private_key=new BigInteger(args[0]);  // My Private key
			BigInteger public_key=new BigInteger(args[1]);   // Public key of the other party
			BigInteger session_key=public_key.modPow(private_key,n);  // Session key
			System.out.println("Session Key: "+ session_key.toString());
		}
        else{
        	//If the correct number of arguments are not provided
            System.out.println("Please provide the valid number of arguments."); 
        }
	}
}

