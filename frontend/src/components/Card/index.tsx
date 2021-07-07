import { Button } from 'components/Button';

type CardProps = {
  title?: string | '';
  text?: string | '';
}

export const Card = (props: CardProps) => {
  return (
    <>
      <div className="card">
        <img className="card-img-top" src=".../100px200/" alt="Imagem de capa do card"/>
        <div className="card-body">
          <h5 className="card-title">{props.title}</h5>
          <p className="card-text">{props.text}</p>
            <Button text="Clique aqui" />
        </div>
      </div>
    </>
  );
}