/*
Approach: Stack And recursion;
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    int i = 0;
public String decodeString(String s) {
    StringBuilder sb = new StringBuilder();
    int count = 0;
    String tmp_string = "";
    
    while (i < s.length()) {
        char c = s.charAt(i);
        i++;
        
        if (c == '[') {
            tmp_string = decodeString(s); // do subproblem
            for (int j = 0; j < count; j++) {
                sb.append(tmp_string);
            }
            count = 0; // reset counter
        } else if (c == ']') { // subproblem complete
            break;
        } else if (Character.isAlphabetic(c)) {
            sb.append(c);
        } else {
            count = count * 10 + c - '0';
        }
    }
    
    return sb.toString();
}
}

/*
Approach: Stack And StringBuilder;
Time complexity:O(N);
Space complexity:O(N); */
class Solution {
  public String decodeString(String s) {
        Stack<StringBuilder> strStack = new Stack<>();  // Stack to store previous strings
        Stack<Integer> numStack = new Stack<>();        // Stack to store repeat counts
        StringBuilder currentStr = new StringBuilder(); // Current string being built
        int k = 0; // Current multiplier (for repetitions)

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Build the multiplier (in case it's more than one digit)
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                // Push the current string and multiplier onto the stacks
                strStack.push(currentStr);
                numStack.push(k);
                // Reset current string and k
                currentStr = new StringBuilder();
                k = 0;
            } else if (c == ']') {
                // Pop the last multiplier and the last string
                int repeatTimes = numStack.pop();
                StringBuilder temp = strStack.pop();
                // Append the current string repeatTimes to the popped string
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(currentStr);
                }
                // Set currentStr to temp, which is the newly formed string
                currentStr = temp;
            } else {
                // Append characters to the current string
                currentStr.append(c);
            }
        }

        // The result will be in currentStr
        return currentStr.toString();
    }
}

