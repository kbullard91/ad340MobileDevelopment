package karibullard.com.ad340App;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.widget.RelativeLayout;

/**
 * Created by karibullard on 4/27/17.
 */

public class InfoList extends AppCompatActivity{

    Context context;
    RecyclerView recyclerView;
    RelativeLayout relativeLayout;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;

    String[] presidents = {
            "George Washington",
            "1789-1797",
            "John Adams",
            "1797-1801",
            "Thomas Jefferson",
            "1801-1809",
            "James Madison",
            "1809-1817",
            "James Monroe",
            "1817-1825",
            "John Quincy Adams",
            "1825-1829",
            "Andrew Jackson",
            "1829-1837",
            "Martin Van Buren",
            "1837-1841",
            "William H. Harrison",
            "1841",
            "John Tyler",
            "1841-1845",
            "James K. Polk",
            "1841-1849",
            "Zachary Taylor",
            "1849-1850",
            "Millard Fillmore",
            "1850-1853",
            "Franklin Pierce",
            "1853-1857",
            "James Buchanan",
            "1857-1861",
            "Abraham Lincoln",
            "1861-1865",
            "Andrew Johnson",
            "1865-1869",
            "Ulysses S. Grant",
            "1869-1877",
            "Rutherford B. Hayes",
            "1877-1881",
            "James A. Garfield",
            "1881",
            "Chester A. Arthur",
            "1881-1885",
            "Grover Cleveland",
            "1885-1889",
            "Benjamin Harrison",
            "1889-1893",
            "Grover Cleveland",
            "1893-1897",
            "William McKinley",
            "1897-1901",
            "Theodore Roosevelt",
            "1901-1909",
            "William H. Taft",
            "1909-1913",
            "Woodrow Wilson",
            "1913-1921",
            "Warren G. Harding",
            "1921-1923",
            "Calvin Coolidge",
            "1923-1929",
            "Herbert Hoover",
            "1929-1933",
            "Franklin D. Roosevelt",
            "1933-1945",
            "Harry S. Truman",
            "1945-1953",
            "Dwight D. Eisenhower",
            "1953-1961",
            "John F. Kennedy",
            "1961-1963",
            "Lyndon B. Johnson",
            "1963-1969",
            "Richard M. Nixon",
            "1969-1974",
            "Gerald R. Ford",
            "1974-1977",
            "Jimmy Carter",
            "1977-1981",
            "Ronald Reagan",
            "1981-1989",
            "George H. W. Bush",
            "1989-1993",
            "Bill Clinton",
            "1993-2001",
            "George W. Bush",
            "2001-2009",
            "Barack Hussein Obama",
            "2009-2017",
            "Donald J. Trump",
            "2017-Present"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);

        setContentView(R.layout.activity_info_list);

        context = getApplicationContext();

        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recylerViewLayoutManager = new GridLayoutManager(context, 2);

        recyclerView.setLayoutManager(recylerViewLayoutManager);

        recyclerViewAdapter = new RecyclerViewAdapter(context, presidents);

        recyclerView.setAdapter(recyclerViewAdapter);
    }

}
