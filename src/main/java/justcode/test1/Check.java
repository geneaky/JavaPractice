package justcode.test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Check implements CheckReturn{

    @Override
    public Map<String, Object> getAttributes() {
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> innerMap = new HashMap<>();
        String hi = "1010";
        List<Integer> bye = new ArrayList<>();
        bye.add(1);
        bye.add(2);
        innerMap.put("hi",hi);
        innerMap.put("bye",bye);
        map.put("hi",hi);
        map.put("bye",bye);
        map.put("response",innerMap);
        return map;
    }
}
