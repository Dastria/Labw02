public class vagon2 extends vagon 
{
    private int Mesta[];
	
    public void PustojVagon(int NomerVagona) 
	{
        NomerEtogoVagona=NomerVagona;
        Mesta = new int[ChisloMest];
        for (int i=0;i<ChisloMest;i++) Mesta[i]=0;        
    }

    public void IzmenitxChisloMest(int NewChisloMest)
	{
        super.ChisloMest = NewChisloMest;
    }


    public void ZanyatxMesto(int NomerMesta) 
	{
		System.out.println("");
		System.out.println("");
        if(Mesta[NomerMesta-1]==1) {System.out.println("Это место уже занято: " + NomerMesta + "(Номер Вагона: " + NomerEtogoVagona + ")");}
        Mesta[NomerMesta-1]=1;
    }

    public void VagonInfo() 
	{
		int NMesta=0;
		int VMesta=0;
        System.out.println("Номер вагона: " + NomerEtogoVagona);
        int CMest = 0;
        for(int i = 0; i < ChisloMest; i++)
		{
            if(Mesta[i]!=1) {CMest++;}
        }
        System.out.println("Число свободных мест: " + CMest);
        System.out.println("Свободные места: ");
        for (int i=0;i<ChisloMest;i++)
		{
            if (Mesta[i]==0) 
			{
				if (i%2==0)
					VMesta++;
				else
					NMesta++;
				System.out.print((i+1)+" ");
			}
        System.out.print("");
		}
		System.out.println("");
		System.out.println("Число верхних мест: " + VMesta);
		System.out.println("Число нижних мест: " + NMesta);
    }



}
