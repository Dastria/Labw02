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
        if(Mesta[NomerMesta-1]==1) {System.out.println("��� ����� ��� ������: " + NomerMesta + "(����� ������: " + NomerEtogoVagona + ")");}
        Mesta[NomerMesta-1]=1;
    }

    public void VagonInfo() 
	{
		int NMesta=0;
		int VMesta=0;
        System.out.println("����� ������: " + NomerEtogoVagona);
        int CMest = 0;
        for(int i = 0; i < ChisloMest; i++)
		{
            if(Mesta[i]!=1) {CMest++;}
        }
        System.out.println("����� ��������� ����: " + CMest);
        System.out.println("��������� �����: ");
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
		System.out.println("����� ������� ����: " + VMesta);
		System.out.println("����� ������ ����: " + NMesta);
    }



}
