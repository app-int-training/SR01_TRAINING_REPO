package com.artist.mn;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

//import java.util.Locale;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

import com.artist.vo.ArtistVo;

@SuppressWarnings("rawtypes")
public class Main implements Callable
{
  	public static final String COLUMN_DELIMITER="\\|";
	public Object onCall(MuleEventContext m) throws Exception
  	{
		MuleMessage message = m.getMessage();
		InputStream inputStreamReader = (InputStream) message.getPayload();
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				inputStreamReader));
		//SimpleDateFormat formatter = new SimpleDateFormat(
		//		"yyyy-MM-dd hh:mm:ss", Locale.ENGLISH);
		//Date dateObj;
		List<ArtistVo> artistArrayList = new ArrayList<ArtistVo>();
		String aLineData = reader.readLine();
		String[] lineDataAsArray;
	    ArtistVo anArtist = new ArtistVo();
		while((aLineData=reader.readLine())!=null)
		{
  		lineDataAsArray = aLineData.split(COLUMN_DELIMITER);
		anArtist.setArtist(lineDataAsArray[0]);
  		anArtist.setClient(lineDataAsArray[1]);
  		anArtist.setArtistName(lineDataAsArray[2]);
  		anArtist.setFirstName(lineDataAsArray[3]);
  		anArtist.setActionCode(lineDataAsArray[4]);
  		anArtist.setLastNamePrefix(lineDataAsArray[5]);
  		anArtist.setSearchInfo(lineDataAsArray[6]);
  		anArtist.setTitle(lineDataAsArray[7]);
  		anArtist.setSpras(lineDataAsArray[8]);  		
        artistArrayList.add(anArtist);
        //anArtist.setReceivedDate(cal);
		artistArrayList.add(anArtist);
  	}
		reader.close();
		return artistArrayList.toString();
}
	}

