import { ChartBar } from "components/charts/CharBar";
import { ChartLine } from "components/charts/ChartLine";
import { DataTable } from "components/DataTable";
import { Footer } from 'components/Footer';
import { NavBar } from 'components/NavBar';

export function Resumo() {
  return (
    <>
      <div className="container">
        
        <div className="row">
          <NavBar />
        </div>

        <div className="row justify-content-around">
          <div className="col-sm-12 col-md-6">
            <ChartLine />
          </div>
          <div className="col-sm-12 col-md-6">
            <ChartBar />
          </div>
        </div>

        <div className="row justify-content-around">
          <div className="col-sm-12 col-md-8">
            <DataTable />
          </div>
        </div>

        <div className="row">
          <Footer />
        </div>
      </div>
    </>
  );
}
