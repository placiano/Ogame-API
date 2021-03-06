package construction.vessel;

import construction.Construction;
import construction.ConstructionRefManager;
import construction.NamingFactory;
import construction.dependencytree.Node;
import construction.dependencytree.NodeDictionary;

public class Cruiser extends Construction
{
    @Override
    protected String getRef()
    {
        return ConstructionRefManager.CRUISER_REF;
    }

    @Override
    protected String getDescription()
    {
        return "Cruisers are armoured almost three times as heavily as heavy fighters and have more than twice the firepower. In addition, they are very fast.";
    }

    @Override
    public Node getDependencyNode()
    {
        return NodeDictionary.getNode(NamingFactory.Cruiser);
    }

    @Override
    public String getName()
    {
        return NamingFactory.Cruiser;
    }
}
