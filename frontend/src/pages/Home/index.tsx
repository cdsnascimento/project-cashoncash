import { Card } from "components/Card";
import { Footer } from "components/Footer";
import { NavBar } from "components/NavBar";
import { useHistory } from 'react-router-dom';

export const Home = () => {
  const history = useHistory();

  function navigationTo(local : string) {
    switch (local) {
      case 'coc':
        history.push('/basecoc');
        break;
      case 'roi':
        history.push('/baseroic');
        break;
      case 'res':
        history.push('/resumo');
        break; 
      case 'clu':
        history.push('/analcluster');
        break;
      case 'glo':
        history.push('/glossario');
        break;                        
    }
  }


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
              <div onClick={() => navigationTo("coc")} className="col-sm-12 col-md-6 col-lg-2">
                <Card cor="#047cac" title="Base Cash On Cash" links="/basecoc" />
              </div>
              <div onClick={() => navigationTo("roi")} className="col-sm-12 col-md-6 col-lg-2">
                <Card cor="#e41d35" title="Base ROIC" links="/baseroic" />
              </div>
              <div onClick={() => navigationTo("res")} className="col-sm-12 col-md-6 col-lg-2">
                <Card cor="#047cac" title="Resumo" links="/resumo" />
              </div>
              <div onClick={() => navigationTo("clu")} className="col-sm-12 col-md-6 col-lg-2">
                <Card cor="#e41d35"  title="Análise por Cluster" links="/analcluster" />
              </div>
              <div onClick={() => navigationTo("glo")} className="col-sm-12 col-md-6 col-lg-2">
                <Card cor="#047cac" title="Glossário" links="/glossario" />
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
