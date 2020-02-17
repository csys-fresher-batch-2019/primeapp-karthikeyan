package testWatchList;

import com.chainsys.primevideos.imp.WatchListDAOImp;

public class TestAddWatch {
	
	public static void main(String[] args) throws Exception {
		WatchListDAOImp wa = new WatchListDAOImp();
		int decide =1;
		if(wa.updateWatched("ramkumar@gmail.com",12321,decide))
		{
			if (decide == 1)
			{
				System.out.println("Movie Streaming");
			}
			else
			{
				System.out.println("Video Added to WatchLater");
			}
		}

	}

}
