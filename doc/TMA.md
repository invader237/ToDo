# Maintenance

## Type de maintenance 

### Corrective

un bug a été signalé par le client et une issue est ouverte, on crée une branche fix/** pour résoudre le problème

### Evolutive

ajout de nouvelles foncitonalité dans une branche feature/** implémentation du TDD, review par du code dans les pr

### Préventive

migration/refacto, permet de garantire la qualité du code.e


## Staging

Mettre en place un staging: prod <- dev <- feature

Les développeur push le code sur des branche feature/** qui leur sont propre et qui sont dédiée a la feature.

## Test 

### TDD

le projet implémente le Test Driven Developpement, ce qui veut dire que les tests doivent etres écrit avant d'implémenter les feature

### Coverrage

S'assurer que la coverage est de minimum 80%

Effectuer test unitaire + test d'intégration + test systeme

### Logique de Test

**Attention**: les test doivent etre exécuter avant chaque push

## CI

Mettre en place un pipeline Ci pour éxécuter les tests automatiquement a chaque pr vers la branche de et la branche main(prod)