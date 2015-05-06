package activity2;

import java.util.*;

public class Activity2 {
     
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);   
        Hero h = new Hero();
        Hero morph = new Hero();
        Hero daz = new Hero();
        Hero tide = new Hero();
        Hero kunk = new Hero();
        Hero wisp = new Hero();
        
        String[] heroes = {"Morphling", "Dazzle", "Tidehunter", "Kunkka", "Wisp"};        
        String[] htype = {"Strength", "Intelligence", "Agility"};
        
        start:
        while(true)
        {    
            System.out.println("Select hero:\n1."+heroes[0]+"\n2."+heroes[1]+"\n3."+heroes[2]+"\n4."+heroes[3]+"\n5."+heroes[4]);
            int i = s.nextInt();
            System.out.println("");

            stats:
            while(true)
            {
                switch(i)
                {
                    case 1:
                        morph.name = heroes[0];
                        morph.type = htype[2];
                        morph.skill[0] = "Waveform";

                        System.out.println("Hero: "+morph.name+"\nType: "+morph.type+"\nSkill 1: "+morph.skill[0]+"\nSkill 2: "+morph.skill[1]+"\nSkill 3: "+morph.skill[2]+"\nSkill 4: "+morph.skill[3]+"\n");
                        break;

                    case 2:
                        daz.name = heroes[1];
                        daz.type = htype[1];
                        daz.skill[0] = "Shadow Poison";

                        System.out.println("Hero: "+daz.name+"\nType: "+daz.type+"\nSkill 1: "+daz.skill[0]+"\nSkill 2: "+daz.skill[1]+"\nSkill 3: "+daz.skill[2]+"\nSkill 4: "+daz.skill[3]+"\n");
                        break;

                    case 3:
                        tide.name = heroes[2];
                        tide.type = htype[0];
                        tide.skill[0] = "Ravage";

                        System.out.println("Hero: "+tide.name+"\nType: "+tide.type+"\nSkill 1: "+tide.skill[0]+"\nSkill 2: "+tide.skill[1]+"\nSkill 3: "+tide.skill[2]+"\nSkill 4: "+tide.skill[3]+"\n");
                        break;

                    case 4:
                        kunk.name = heroes[3];
                        kunk.type = htype[0];
                        kunk.skill[0] = "Torrent";

                        System.out.println("Hero: "+kunk.name+"\nType: "+kunk.type+"\nSkill 1: "+kunk.skill[0]+"\nSkill 2: "+kunk.skill[1]+"\nSkill 3: "+kunk.skill[2]+"\nSkill 4: "+kunk.skill[3]+"\n");
                        break;

                    case 5:
                        wisp.name = heroes[4];
                        wisp.type = htype[0];
                        wisp.skill[0] = "Relocate";

                        System.out.println("Hero: "+wisp.name+"\nType: "+wisp.type+"\nSkill 1: "+wisp.skill[0]+"\nSkill 2: "+wisp.skill[1]+"\nSkill 3: "+wisp.skill[2]+"\nSkill 4: "+wisp.skill[3]+"\n");
                        break;  

                    default:
                        break;                     
                }

                System.out.println("Select Command:\n1. Attack\n2. Block\n3. Add Skill\n4. Repick Hero");
                int command = s.nextInt();
                System.out.println("");

                switch(command)
                {
                    case 1:
                        System.out.println("Select Skill:");

                        switch(i)
                        {
                            case 1:
                                System.out.println("Skill 1: "+morph.skill[0]+"\nSkill 2: "+morph.skill[1]+"\nSkill 3: "+morph.skill[2]+"\nSkill 4: "+morph.skill[3]+"\n");
                                break;
                            case 2:
                                System.out.println("Skill 1: "+daz.skill[0]+"\nSkill 2: "+daz.skill[1]+"\nSkill 3: "+daz.skill[2]+"\nSkill 4: "+daz.skill[3]+"\n");
                                break;
                            case 3:
                                System.out.println("Skill 1: "+tide.skill[0]+"\nSkill 2: "+tide.skill[1]+"\nSkill 3: "+tide.skill[2]+"\nSkill 4: "+tide.skill[3]+"\n");
                                break;
                            case 4:
                                System.out.println("Skill 1: "+kunk.skill[0]+"\nSkill 2: "+kunk.skill[1]+"\nSkill 3: "+kunk.skill[2]+"\nSkill 4: "+kunk.skill[3]+"\n");
                                break;
                            case 5:
                                System.out.println("Skill 1: "+wisp.skill[0]+"\nSkill 2: "+wisp.skill[1]+"\nSkill 3: "+wisp.skill[2]+"\nSkill 4: "+wisp.skill[3]+"\n");
                                break;
                            default:
                                break;
                        }

                        int atk = s.nextInt()-1;
                        System.out.print(heroes[i-1]+h.attack());

                        switch(i)
                        {
                            case 1:
                                System.out.println(morph.skill[atk]);
                                break;
                            case 2:
                                System.out.println(daz.skill[atk]);
                                break;
                            case 3:
                                System.out.println(tide.skill[atk]);
                                break;
                            case 4:
                                System.out.println(kunk.skill[atk]);
                                break;
                            case 5:
                                System.out.println(wisp.skill[atk]);
                                break;
                            default:
                                break;
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println("Select Skill:");

                        switch(i)
                        {
                            case 1:
                                System.out.println("Skill 1: "+morph.skill[0]+"\nSkill 2: "+morph.skill[1]+"\nSkill 3: "+morph.skill[2]+"\nSkill 4: "+morph.skill[3]+"\n");
                                break;
                            case 2:
                                System.out.println("Skill 1: "+daz.skill[0]+"\nSkill 2: "+daz.skill[1]+"\nSkill 3: "+daz.skill[2]+"\nSkill 4: "+daz.skill[3]+"\n");
                                break;
                            case 3:
                                System.out.println("Skill 1: "+tide.skill[0]+"\nSkill 2: "+tide.skill[1]+"\nSkill 3: "+tide.skill[2]+"\nSkill 4: "+tide.skill[3]+"\n");
                                break;
                            case 4:
                                System.out.println("Skill 1: "+kunk.skill[0]+"\nSkill 2: "+kunk.skill[1]+"\nSkill 3: "+kunk.skill[2]+"\nSkill 4: "+kunk.skill[3]+"\n");
                                break;
                            case 5:
                                System.out.println("Skill 1: "+wisp.skill[0]+"\nSkill 2: "+wisp.skill[1]+"\nSkill 3: "+wisp.skill[2]+"\nSkill 4: "+wisp.skill[3]+"\n");
                                break;
                            default:
                                break;
                        }

                        int block = s.nextInt()-1;
                        System.out.print(heroes[i-1]+h.block());

                        switch(i)
                        {
                            case 1:
                                System.out.println(morph.skill[block]);
                                break;
                            case 2:
                                System.out.println(daz.skill[block]);
                                break;
                            case 3:
                                System.out.println(tide.skill[block]);
                                break;
                            case 4:
                                System.out.println(kunk.skill[block]);
                                break;
                            case 5:
                                System.out.println(wisp.skill[block]);
                                break;
                            default:
                                break;
                        }
                        System.out.println("");
                        break;

                    case 3:                                             
                        System.out.println("Add Skill: ");
                        String newSkill;
                        int iter = 0;
                        boolean flag = true;
                        s.nextLine();
                        newSkill = s.nextLine();

                        switch(i)
                        {
                            case 1:
                                if(morph.skill[3]!=null)
                                {
                                    System.out.println("Can't add anymore skills!\n");
                                    flag = false;
                                }
                                else
                                {
                                    while(morph.skill[iter]!=null)
                                    {
                                        iter++;
                                    }
                                    morph.skill[iter] = newSkill;
                                }
                                break;

                            case 2:
                                if(daz.skill[3]!=null)
                                {
                                    System.out.println("Can't add anymore skills!\n");
                                    flag = false;
                                }
                                else
                                {
                                    while(daz.skill[iter]!=null)
                                    {
                                        iter++;
                                    }
                                    daz.skill[iter] = newSkill;      
                                }
                                break;

                            case 3:
                                if(tide.skill[3]!=null)
                                {
                                    System.out.println("Can't add anymore skills!\n");
                                    flag = false;
                                }
                                else
                                {
                                    while(tide.skill[iter]!=null)
                                    {
                                        iter++;
                                    }
                                    tide.skill[iter] = newSkill;     
                                }
                                break;

                            case 4:
                                if(kunk.skill[3]!=null)
                                {
                                    System.out.println("Can't add anymore skills!\n");
                                    flag = false;
                                }
                                else
                                {
                                    while(kunk.skill[iter]!=null)
                                    {
                                        iter++;
                                    }
                                    kunk.skill[iter] = newSkill;    
                                }
                                break;

                            case 5:
                                if(wisp.skill[3]!=null)
                                {
                                    System.out.println("Can't add anymore skills!\n");
                                    flag = false;
                                }
                                else
                                {
                                    while(wisp.skill[iter]!=null)
                                    {
                                        iter++;
                                    }
                                    wisp.skill[iter] = newSkill;      
                                }
                                break;

                            default:
                                break;
                        }
                        if(flag)
                            System.out.println(heroes[i-1]+" has learned Skill "+(iter+1)+": "+newSkill+"\n");                        
                        break;

                    case 4:    
                        continue start;

                    default:
                        break;                
                }
            }
        }
    }    
}