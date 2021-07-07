export function DataTable(){
  return(
    <div>
      <div className="table-responsive-sm">
        <table className="table table-hover">
          <thead>
            <tr className="table-dark">
              <th></th>
              <th>2019</th>
              <th>2020</th>
              <th>2021</th>
              <th>LTM</th>
              <th>TOTAL</th>
            </tr>
          </thead>
        <tbody>
        <tr className="table-primary">
          <th>Cash on Cash</th>
          <td>6,1%</td>
          <td>1,4%</td>
          <td>-2,7%</td>
          <td>-0,2%</td>
          <td>4,8%</td>
        </tr>
        <tr>
          <th>EBITDA Médio</th>
          <td>21.040</td>
          <td>949</td>
          <td>-4.187</td>
          <td>-69</td>
          <td>8.377</td>
        </tr>
        <tr className="table-primary">
          <th>ROIC</th>
          <td>-2,1%</td>
          <td>-4,8%</td>
          <td>-3,5%</td>
          <td>5,0%</td>
          <td>-10,4%</td>
        </tr>
        <tr>
          <th>EBIT Médio</th>
          <td>5.386</td>
          <td>-5.140</td>
          <td>-8.345</td>
          <td>-4.994</td>
          <td>-1.337</td>
        </tr>
        </tbody>
        </table>
      </div> 
    </div>

  );
}