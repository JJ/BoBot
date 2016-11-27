es_locale:
  locale.present:
    - name: es_ES.UTF-8

default_locale:
  locale.system:
    - name: es_ES.UTF-8
    - require:
      - locale: es_locale