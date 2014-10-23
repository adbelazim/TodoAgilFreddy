package cl.usach.gettrello;

import cl.usach.elements.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import org.json.JSONException;



/**
 * 
 *
 * @author FGT
 */
public interface Trello{
    
     public void setConfigTrello(String KEY, String SECRET, String TOKEN);
     
     public Boolean checkConf(String idMember) throws IOException;
    
    /* ---------- Boards ----------------*/    
        
    public BoardElem getBoard(String idBoard) throws IOException, JSONException;
    
    public BoardElem getBoardByIdAction(String idAction) throws IOException;
    
    public BoardElem getBoardByIdCard(String idCard) throws IOException;
    
    public BoardElem getBoardByIdList(String idList) throws IOException;
    
    public List<BoardElem> getBoardsByIdMember(String idMember) throws IOException;
    
    
    /* ---------- Actions ----------------*/

    public List<ActionElement> getActions(String idBoard) throws IOException, JSONException;

    public ActionElement getAction(String idAction) throws IOException, JSONException;
    
    public List<ActionElement> getActionsByIdCard(String idCard) throws IOException;
    
    public List<ActionElement> getActionsByIdList(String idList) throws IOException;
    
    public List<ActionElement> getActionsByIdMember(String idMember) throws IOException;
    
    /* ---------- Cards ----------------*/
   
    public List<CardElement> getCards(String idBoard) throws IOException;

    public CardElement getCard(String idBoard, String idCard) throws IOException;

    public List<CardElement> getCards(String idBoard, String idMember) throws IOException;

    public CardElement getCardByIdAction(String idAction) throws IOException;
    
    public CardElement getCard(String idCard) throws IOException;
    
    public List<CardElement> getCardsByIdList(String idList) throws IOException;
    
    public List<CardElement> getCardsByIdMember(String idMember) throws IOException;
    
    /* ---------- Lists ----------------*/
    
    public List<ListElement> getLists(String idBoard) throws IOException;
    
    public ListElement getListByIdCard(String idCard) throws IOException;
    
    public ListElement getList(String idList) throws IOException;
    
    /* ---------- Members ----------------*/

    public List<MemberElement> getMembers (String idBoard) throws IOException;
    
    public MemberElement getMemberCreator(String idAction) throws IOException;
    
    public List<MemberElement> getMembersByIdCard (String idCard) throws IOException;
    
    public MemberElement getMember(String idMember) throws IOException;
}
