    public class poezd 
	{
        public static void main(String[] args) 
		{
            vagon2 v1 = new vagon2();
            v1.PustojVagon(1);
            v1.ZanyatxMesto(5);
            v1.ZanyatxMesto(15);
            v1.VagonInfo();

            vagon2 v2 = new vagon2();
            v2.IzmenitxChisloMest(47);
            v2.PustojVagon(3);
            v2.ZanyatxMesto(9);
            v2.ZanyatxMesto(3);
            v2.ZanyatxMesto(3);
            v2.VagonInfo();
        }
	}
