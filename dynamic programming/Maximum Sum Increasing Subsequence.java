	static int MSIS(int[] arr, int n)
	{
		int msis[] = new int[n];

		
		for(int i=0; i<n; i++)
		{
			msis[i]  = arr[i];


			for(int j=0; j<i; j++)
			{
				if(arr[j] < arr[i])
				{
					msis[i] = Math.max(msis[i], arr[i] + msis[j]);
				}
			}
		}

		int res = msis[0];

		for(int i=0; i<n; i++)
		{
			res = Math.max(res, msis[i]);
		}

		return res;
	}
