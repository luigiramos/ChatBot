import java.util.Scanner;

public class ChatBot {
	private String botName = "Course Bot";
	Scanner scan = new Scanner(System.in);
	String userResponse;
	String highPayKeywords[] = {"high pay", "lots of money", "rich", "pays well"};
	String passionKeywords[] = {"interests", "interest", "passion", "passions"};
	String parentsKeywords[] = {"parents", "parent", "dad", "mom", "father", "mother"};
	
	public void start(){
		botSay("Hi, my name is "+botName+" and I'm here to help you look for a college course that suits you.");
		botSay("What kind of course are you looking for?");
		
		userResponse = userSay();
		if (keywordMatcher(userResponse, highPayKeywords)){
			highPayBranch();
		}
		if (keywordMatcher(userResponse, passionKeywords)){
			passionBranch();
		}
		if (keywordMatcher(userResponse, parentsKeywords)){
			parentsBranch();
		}
	}
	
	private void highPayBranch() {
		System.out.println("high pay");
		
	}

	private void passionBranch() {
		System.out.println("passion");
		
	}

	private void parentsBranch() {
		
	}

	public void botSay(String s){ //Bot response
		System.out.println(botName+": "+s+"\n");
	}
	
	public String userSay(){ //user response
		System.out.print("You: ");
		String response = scan.nextLine();
		return response;
	}
	
	public boolean keywordMatcher(String response, String keywords[]){
		for(int i = 0; i<keywords.length; i++){
			if (response.contains(keywords[i])){
				return true;
			}
		}
		return false;
	}
}
