import { Card } from 'components/Card';
import { Footer } from "components/Footer";
import { NavBar } from "components/NavBar";

export const Home = () => {
  return (
    <>
      <div className="container">
        <div className="row">
          <NavBar />
        </div>
        <div className="row">
          <div className="jumbotron">
            <h1 className="display-4">DOMINO'S PIZZA BRASIL</h1>
            <p className="lead">Analise Cash on Cash e ROIC | FP&A.</p>
            <hr className="my-4" />
            <div className="row justify-content-md-center">
              <div className="col-sm-12 col-md-6 col-lg-2">
                <Card title="Base Cash On Cash" />
              </div>
              <div className="col-sm-12 col-md-6 col-lg-2">
                <Card title="Base ROIC" />
              </div>
              <div className="col-sm-12 col-md-6 col-lg-2">
                <Card title="Resumo Consolidado" />
              </div>              
              <div className="col-sm-12 col-md-6 col-lg-2">
                <Card title="Análise por Cluster" />
              </div>
              <div className="col-sm-12 col-md-6 col-lg-2">
                <Card title="Glossário" />
              </div>              
            </div>
            <div className="row my-5">
              <Footer />
            </div>
          </div>
        </div>
      </div>
    </>
  );
};
