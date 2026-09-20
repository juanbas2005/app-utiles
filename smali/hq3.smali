.class public final Lhq3;
.super Ljava/lang/Object;

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final x:Loq3;


# direct methods
.method public synthetic constructor <init>(Loq3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhq3;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lhq3;->x:Loq3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public synthetic constructor <init>(Loq3;Lkq3;I)V
    .locals 0

    .line 9
    iput p3, p0, Lhq3;->w:I

    iput-object p1, p0, Lhq3;->x:Loq3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lhq3;->w:I

    .line 4
    .line 5
    sget-object v2, Llq3;->x:Llq3;

    .line 6
    .line 7
    const-class v3, Lkotlin/Metadata;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, -0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v0, v0, Lhq3;->x:Loq3;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, Loq3;->x:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0}, Loq3;->a0()Lgq0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-boolean v1, v0, Lgq0;->c:Z

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v0}, Lgq0;->a()Lup2;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v0, v0, Lup2;->a:Lvp2;

    .line 41
    .line 42
    iget-object v7, v0, Lvp2;->a:Ljava/lang/String;

    .line 43
    .line 44
    :goto_0
    return-object v7

    .line 45
    :pswitch_0
    iget-object v1, v0, Loq3;->x:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {v0}, Loq3;->a0()Lgq0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-boolean v2, v0, Lgq0;->c:Z

    .line 59
    .line 60
    if-eqz v2, :cond_6

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v1}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const/16 v2, 0x24

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v7, v0, v7}, Ld57;->c1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Class;->getEnclosingConstructor()Ljava/lang/reflect/Constructor;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v7, v0, v7}, Ld57;->c1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    goto :goto_1

    .line 128
    :cond_4
    const/4 v0, 0x6

    .line 129
    invoke-static {v7, v2, v6, v0}, Ld57;->F0(Ljava/lang/CharSequence;CII)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-ne v0, v5, :cond_5

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_5
    add-int/2addr v0, v4

    .line 137
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    goto :goto_1

    .line 146
    :cond_6
    invoke-virtual {v0}, Lgq0;->f()Luq4;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Luq4;->b()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    :goto_1
    return-object v7

    .line 158
    :pswitch_1
    iget-object v0, v0, Loq3;->x:Ljava/lang/Class;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Class;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    array-length v3, v1

    .line 169
    array-length v2, v2

    .line 170
    if-eq v3, v2, :cond_e

    .line 171
    .line 172
    new-instance v2, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 175
    .line 176
    .line 177
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 178
    .line 179
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 180
    .line 181
    .line 182
    move-object v1, v0

    .line 183
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    array-length v8, v6

    .line 188
    sub-int/2addr v8, v4

    .line 189
    :goto_2
    if-ge v5, v8, :cond_d

    .line 190
    .line 191
    aget-object v9, v6, v8

    .line 192
    .line 193
    sget-object v10, Loq3;->z:Ljava/util/HashSet;

    .line 194
    .line 195
    invoke-static {v9}, Lkl8;->p(Ljava/lang/annotation/Annotation;)Lgq3;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    invoke-static {v11}, Lkl8;->u(Lgq3;)Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v11

    .line 207
    invoke-virtual {v10, v11}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    if-nez v10, :cond_c

    .line 212
    .line 213
    const-string v10, "value"

    .line 214
    .line 215
    if-eq v1, v0, :cond_8

    .line 216
    .line 217
    sget-object v11, Lg18;->a:Lup2;

    .line 218
    .line 219
    invoke-static {v9}, Lkl8;->p(Ljava/lang/annotation/Annotation;)Lgq3;

    .line 220
    .line 221
    .line 222
    move-result-object v11

    .line 223
    invoke-static {v11}, Lkl8;->u(Lgq3;)Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object v11

    .line 227
    const-class v12, Ljava/lang/annotation/Inherited;

    .line 228
    .line 229
    invoke-virtual {v11, v12}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 230
    .line 231
    .line 232
    move-result-object v11

    .line 233
    if-eqz v11, :cond_c

    .line 234
    .line 235
    invoke-static {v9}, Lkl8;->p(Ljava/lang/annotation/Annotation;)Lgq3;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    invoke-static {v11}, Lg18;->j(Lgq3;)Z

    .line 240
    .line 241
    .line 242
    move-result v11

    .line 243
    if-eqz v11, :cond_8

    .line 244
    .line 245
    invoke-static {v9}, Lkl8;->p(Ljava/lang/annotation/Annotation;)Lgq3;

    .line 246
    .line 247
    .line 248
    move-result-object v11

    .line 249
    invoke-static {v11}, Lkl8;->u(Lgq3;)Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object v11

    .line 253
    invoke-virtual {v11, v10, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 254
    .line 255
    .line 256
    move-result-object v11

    .line 257
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    invoke-virtual {v11}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    sget-object v13, Lb26;->a:Lc26;

    .line 269
    .line 270
    invoke-virtual {v13, v11}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    invoke-static {v11}, Lkl8;->u(Lgq3;)Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    invoke-virtual {v11, v12}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 279
    .line 280
    .line 281
    move-result-object v11

    .line 282
    if-eqz v11, :cond_c

    .line 283
    .line 284
    :cond_8
    sget-object v11, Lg18;->a:Lup2;

    .line 285
    .line 286
    invoke-static {v9}, Lkl8;->p(Ljava/lang/annotation/Annotation;)Lgq3;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    invoke-static {v11}, Lg18;->j(Lgq3;)Z

    .line 291
    .line 292
    .line 293
    move-result v12

    .line 294
    if-eqz v12, :cond_9

    .line 295
    .line 296
    invoke-static {v11}, Lkl8;->u(Lgq3;)Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    move-result-object v11

    .line 300
    invoke-virtual {v11, v10, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    move-result-object v10

    .line 308
    invoke-virtual {v10}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    move-result-object v10

    .line 312
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    sget-object v11, Lb26;->a:Lc26;

    .line 316
    .line 317
    invoke-virtual {v11, v10}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 318
    .line 319
    .line 320
    move-result-object v11

    .line 321
    :cond_9
    invoke-virtual {v3, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v10

    .line 325
    check-cast v10, Ljava/lang/Class;

    .line 326
    .line 327
    if-nez v10, :cond_a

    .line 328
    .line 329
    invoke-interface {v3, v11, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    :cond_a
    if-eqz v10, :cond_b

    .line 333
    .line 334
    invoke-virtual {v10, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    if-eqz v10, :cond_c

    .line 339
    .line 340
    :cond_b
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    :cond_c
    add-int/lit8 v8, v8, -0x1

    .line 344
    .line 345
    goto/16 :goto_2

    .line 346
    .line 347
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    if-nez v1, :cond_7

    .line 352
    .line 353
    invoke-static {v2}, Ldt0;->O0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    goto :goto_4

    .line 358
    :cond_e
    new-instance v0, Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 361
    .line 362
    .line 363
    array-length v2, v1

    .line 364
    :goto_3
    if-ge v6, v2, :cond_10

    .line 365
    .line 366
    aget-object v3, v1, v6

    .line 367
    .line 368
    sget-object v4, Loq3;->z:Ljava/util/HashSet;

    .line 369
    .line 370
    invoke-static {v3}, Lkl8;->p(Ljava/lang/annotation/Annotation;)Lgq3;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    invoke-static {v5}, Lkl8;->u(Lgq3;)Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v4

    .line 386
    if-nez v4, :cond_f

    .line 387
    .line 388
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    :cond_f
    add-int/lit8 v6, v6, 0x1

    .line 392
    .line 393
    goto :goto_3

    .line 394
    :cond_10
    :goto_4
    invoke-static {v0}, Lg18;->t(Ljava/util/List;)Ljava/util/List;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    return-object v0

    .line 399
    :pswitch_2
    sget-object v1, Lmb2;->a:Lwu0;

    .line 400
    .line 401
    sget-object v1, Lf62;->j:Lf62;

    .line 402
    .line 403
    sget-object v17, Le62;->j:Le62;

    .line 404
    .line 405
    new-instance v2, Ljava/util/HashMap;

    .line 406
    .line 407
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 408
    .line 409
    .line 410
    invoke-static {v0}, Lkl8;->u(Lgq3;)Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    invoke-virtual {v5, v3}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 415
    .line 416
    .line 417
    move-result-object v3

    .line 418
    if-eqz v3, :cond_11

    .line 419
    .line 420
    move v3, v4

    .line 421
    goto :goto_5

    .line 422
    :cond_11
    move v3, v6

    .line 423
    :goto_5
    new-instance v5, Ljava/util/HashMap;

    .line 424
    .line 425
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 426
    .line 427
    .line 428
    if-eqz v3, :cond_13

    .line 429
    .line 430
    invoke-static {v0}, Lmb2;->b(Lgq3;)Ljava/util/Collection;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 435
    .line 436
    .line 437
    move-result-object v8

    .line 438
    :cond_12
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 439
    .line 440
    .line 441
    move-result v9

    .line 442
    if-eqz v9, :cond_13

    .line 443
    .line 444
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v9

    .line 448
    check-cast v9, Lp16;

    .line 449
    .line 450
    invoke-static {v0, v9}, Lmb2;->d(Loq3;Lp16;)Z

    .line 451
    .line 452
    .line 453
    move-result v10

    .line 454
    if-nez v10, :cond_12

    .line 455
    .line 456
    invoke-static {v9, v1}, Lmb2;->h(Lp16;Lgr8;)Lg62;

    .line 457
    .line 458
    .line 459
    move-result-object v10

    .line 460
    invoke-virtual {v5, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    goto :goto_6

    .line 464
    :cond_13
    invoke-virtual {v0}, Loq3;->e()Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object v8

    .line 468
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 469
    .line 470
    .line 471
    move-result-object v18

    .line 472
    move v8, v6

    .line 473
    move v9, v8

    .line 474
    :goto_7
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v10

    .line 478
    if-eqz v10, :cond_31

    .line 479
    .line 480
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v10

    .line 484
    check-cast v10, Las3;

    .line 485
    .line 486
    invoke-interface {v10}, Las3;->J()Lvq3;

    .line 487
    .line 488
    .line 489
    move-result-object v11

    .line 490
    instance-of v12, v11, Lgq3;

    .line 491
    .line 492
    if-eqz v12, :cond_14

    .line 493
    .line 494
    check-cast v11, Lgq3;

    .line 495
    .line 496
    goto :goto_8

    .line 497
    :cond_14
    move-object v11, v7

    .line 498
    :goto_8
    if-eqz v11, :cond_30

    .line 499
    .line 500
    sget-object v12, Lis3;->c:Lis3;

    .line 501
    .line 502
    invoke-static {v10}, Led1;->k(Las3;)Lis3;

    .line 503
    .line 504
    .line 505
    move-result-object v10

    .line 506
    invoke-static {v11}, Lmb2;->c(Lgq3;)Llb2;

    .line 507
    .line 508
    .line 509
    move-result-object v11

    .line 510
    if-nez v8, :cond_16

    .line 511
    .line 512
    iget-boolean v8, v11, Llb2;->b:Z

    .line 513
    .line 514
    if-eqz v8, :cond_15

    .line 515
    .line 516
    goto :goto_9

    .line 517
    :cond_15
    move/from16 v19, v6

    .line 518
    .line 519
    goto :goto_a

    .line 520
    :cond_16
    :goto_9
    move/from16 v19, v4

    .line 521
    .line 522
    :goto_a
    if-nez v9, :cond_18

    .line 523
    .line 524
    iget-boolean v8, v11, Llb2;->c:Z

    .line 525
    .line 526
    if-eqz v8, :cond_17

    .line 527
    .line 528
    goto :goto_b

    .line 529
    :cond_17
    move/from16 v20, v6

    .line 530
    .line 531
    goto :goto_c

    .line 532
    :cond_18
    :goto_b
    move/from16 v20, v4

    .line 533
    .line 534
    :goto_c
    iget-object v8, v11, Llb2;->a:Ljava/util/HashMap;

    .line 535
    .line 536
    invoke-virtual {v8}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 537
    .line 538
    .line 539
    move-result-object v8

    .line 540
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 541
    .line 542
    .line 543
    move-result-object v21

    .line 544
    :goto_d
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    .line 545
    .line 546
    .line 547
    move-result v8

    .line 548
    if-eqz v8, :cond_2f

    .line 549
    .line 550
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v8

    .line 554
    check-cast v8, Ljava/util/Map$Entry;

    .line 555
    .line 556
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v8

    .line 560
    check-cast v8, Lp16;

    .line 561
    .line 562
    move-object v9, v8

    .line 563
    check-cast v9, Lq16;

    .line 564
    .line 565
    iget-object v9, v9, Lq16;->w:Lfq3;

    .line 566
    .line 567
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    iget-object v11, v9, Lfq3;->a:Lis3;

    .line 574
    .line 575
    if-eqz v11, :cond_1f

    .line 576
    .line 577
    iget-object v12, v11, Lis3;->a:Ljava/util/Map;

    .line 578
    .line 579
    iget-boolean v13, v10, Lis3;->b:Z

    .line 580
    .line 581
    iget-boolean v14, v11, Lis3;->b:Z

    .line 582
    .line 583
    if-eqz v14, :cond_19

    .line 584
    .line 585
    :goto_e
    move/from16 v33, v6

    .line 586
    .line 587
    goto :goto_10

    .line 588
    :cond_19
    invoke-interface {v12}, Ljava/util/Map;->isEmpty()Z

    .line 589
    .line 590
    .line 591
    move-result v14

    .line 592
    if-eqz v14, :cond_1a

    .line 593
    .line 594
    sget-object v11, Lis3;->c:Lis3;

    .line 595
    .line 596
    invoke-virtual {v11, v13}, Lis3;->a(Z)Lis3;

    .line 597
    .line 598
    .line 599
    move-result-object v11

    .line 600
    goto :goto_e

    .line 601
    :cond_1a
    iget-object v14, v10, Lis3;->a:Ljava/util/Map;

    .line 602
    .line 603
    invoke-interface {v14}, Ljava/util/Map;->isEmpty()Z

    .line 604
    .line 605
    .line 606
    move-result v14

    .line 607
    if-eqz v14, :cond_1b

    .line 608
    .line 609
    invoke-virtual {v11, v13}, Lis3;->a(Z)Lis3;

    .line 610
    .line 611
    .line 612
    move-result-object v11

    .line 613
    goto :goto_e

    .line 614
    :cond_1b
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 615
    .line 616
    invoke-interface {v12}, Ljava/util/Map;->size()I

    .line 617
    .line 618
    .line 619
    move-result v14

    .line 620
    invoke-static {v14}, Ltf4;->F(I)I

    .line 621
    .line 622
    .line 623
    move-result v14

    .line 624
    invoke-direct {v11, v14}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 625
    .line 626
    .line 627
    invoke-interface {v12}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 628
    .line 629
    .line 630
    move-result-object v12

    .line 631
    check-cast v12, Ljava/lang/Iterable;

    .line 632
    .line 633
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 634
    .line 635
    .line 636
    move-result-object v12

    .line 637
    :goto_f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 638
    .line 639
    .line 640
    move-result v14

    .line 641
    if-eqz v14, :cond_1d

    .line 642
    .line 643
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v14

    .line 647
    check-cast v14, Ljava/util/Map$Entry;

    .line 648
    .line 649
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v15

    .line 653
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v14

    .line 657
    check-cast v14, Lgs3;

    .line 658
    .line 659
    iget-object v4, v14, Lgs3;->b:Las3;

    .line 660
    .line 661
    move/from16 v33, v6

    .line 662
    .line 663
    iget-object v6, v14, Lgs3;->a:Lks3;

    .line 664
    .line 665
    if-eqz v4, :cond_1c

    .line 666
    .line 667
    if-eqz v6, :cond_1c

    .line 668
    .line 669
    invoke-virtual {v10, v4, v6}, Lis3;->b(Las3;Lks3;)Lgs3;

    .line 670
    .line 671
    .line 672
    move-result-object v14

    .line 673
    :cond_1c
    invoke-interface {v11, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move/from16 v6, v33

    .line 677
    .line 678
    const/4 v4, 0x1

    .line 679
    goto :goto_f

    .line 680
    :cond_1d
    move/from16 v33, v6

    .line 681
    .line 682
    new-instance v4, Lis3;

    .line 683
    .line 684
    invoke-direct {v4, v11, v13}, Lis3;-><init>(Ljava/util/Map;Z)V

    .line 685
    .line 686
    .line 687
    move-object v11, v4

    .line 688
    :goto_10
    if-nez v11, :cond_1e

    .line 689
    .line 690
    goto :goto_11

    .line 691
    :cond_1e
    move-object/from16 v23, v11

    .line 692
    .line 693
    goto :goto_12

    .line 694
    :cond_1f
    move/from16 v33, v6

    .line 695
    .line 696
    :goto_11
    move-object/from16 v23, v10

    .line 697
    .line 698
    :goto_12
    const/16 v31, 0x0

    .line 699
    .line 700
    const/16 v32, 0x1fe

    .line 701
    .line 702
    const/16 v24, 0x0

    .line 703
    .line 704
    const/16 v25, 0x0

    .line 705
    .line 706
    const/16 v26, 0x0

    .line 707
    .line 708
    const/16 v27, 0x0

    .line 709
    .line 710
    const/16 v28, 0x0

    .line 711
    .line 712
    const/16 v29, 0x0

    .line 713
    .line 714
    const/16 v30, 0x0

    .line 715
    .line 716
    move-object/from16 v22, v9

    .line 717
    .line 718
    invoke-static/range {v22 .. v32}, Lfq3;->a(Lfq3;Lis3;Lel4;Ljava/lang/Boolean;Lyq3;Ljava/util/List;ZZZZI)Lfq3;

    .line 719
    .line 720
    .line 721
    move-result-object v34

    .line 722
    move-object v4, v8

    .line 723
    check-cast v4, Lq16;

    .line 724
    .line 725
    iget-object v4, v4, Lq16;->w:Lfq3;

    .line 726
    .line 727
    iget-object v4, v4, Lfq3;->d:Lyq3;

    .line 728
    .line 729
    if-nez v4, :cond_20

    .line 730
    .line 731
    invoke-interface {v8}, Lp16;->B()Lyq3;

    .line 732
    .line 733
    .line 734
    move-result-object v4

    .line 735
    :cond_20
    move-object/from16 v38, v4

    .line 736
    .line 737
    invoke-interface {v8}, Leq3;->getTypeParameters()Ljava/util/List;

    .line 738
    .line 739
    .line 740
    move-result-object v39

    .line 741
    invoke-static {v8}, Lmb2;->e(Lp16;)Z

    .line 742
    .line 743
    .line 744
    move-result v4

    .line 745
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 746
    .line 747
    .line 748
    move-result-object v37

    .line 749
    const/16 v43, 0x0

    .line 750
    .line 751
    const/16 v44, 0x1e3

    .line 752
    .line 753
    const/16 v35, 0x0

    .line 754
    .line 755
    const/16 v36, 0x0

    .line 756
    .line 757
    const/16 v40, 0x0

    .line 758
    .line 759
    const/16 v41, 0x0

    .line 760
    .line 761
    const/16 v42, 0x0

    .line 762
    .line 763
    invoke-static/range {v34 .. v44}, Lfq3;->a(Lfq3;Lis3;Lel4;Ljava/lang/Boolean;Lyq3;Ljava/util/List;ZZZZI)Lfq3;

    .line 764
    .line 765
    .line 766
    move-result-object v4

    .line 767
    invoke-interface {v8, v0, v4}, Lp16;->x(Lyq3;Lfq3;)Lp16;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    invoke-static {v4, v1}, Lmb2;->h(Lp16;Lgr8;)Lg62;

    .line 772
    .line 773
    .line 774
    move-result-object v6

    .line 775
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    move-result v8

    .line 779
    if-nez v8, :cond_2e

    .line 780
    .line 781
    new-instance v8, Lg62;

    .line 782
    .line 783
    iget-object v9, v6, Lg62;->a:Lut6;

    .line 784
    .line 785
    move-object v11, v10

    .line 786
    iget-object v10, v6, Lg62;->b:Ljava/lang/String;

    .line 787
    .line 788
    move-object v12, v11

    .line 789
    iget-object v11, v6, Lg62;->c:Ljava/lang/String;

    .line 790
    .line 791
    move-object v13, v12

    .line 792
    iget-object v12, v6, Lg62;->d:Ljava/util/List;

    .line 793
    .line 794
    move-object v14, v13

    .line 795
    iget-object v13, v6, Lg62;->e:Ljava/util/ArrayList;

    .line 796
    .line 797
    move-object v15, v14

    .line 798
    iget-object v14, v6, Lg62;->f:Ljava/util/List;

    .line 799
    .line 800
    move-object/from16 v16, v15

    .line 801
    .line 802
    iget-object v15, v6, Lg62;->g:Ljava/util/List;

    .line 803
    .line 804
    iget-boolean v6, v6, Lg62;->h:Z

    .line 805
    .line 806
    move-object/from16 v45, v16

    .line 807
    .line 808
    move/from16 v16, v6

    .line 809
    .line 810
    move-object/from16 v6, v45

    .line 811
    .line 812
    invoke-direct/range {v8 .. v17}, Lg62;-><init>(Lut6;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLgr8;)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v2, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v9

    .line 819
    if-eqz v9, :cond_2d

    .line 820
    .line 821
    check-cast v9, Lp16;

    .line 822
    .line 823
    sget-object v10, La91;->x:La91;

    .line 824
    .line 825
    invoke-virtual {v10, v9, v4}, La91;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 826
    .line 827
    .line 828
    move-result v10

    .line 829
    if-gtz v10, :cond_21

    .line 830
    .line 831
    move-object v10, v9

    .line 832
    goto :goto_13

    .line 833
    :cond_21
    move-object v10, v4

    .line 834
    :goto_13
    instance-of v11, v9, Lzq3;

    .line 835
    .line 836
    if-eqz v11, :cond_2b

    .line 837
    .line 838
    instance-of v11, v4, Lzq3;

    .line 839
    .line 840
    if-eqz v11, :cond_2b

    .line 841
    .line 842
    invoke-interface {v10}, Lp16;->B()Lyq3;

    .line 843
    .line 844
    .line 845
    move-result-object v11

    .line 846
    move-object v12, v10

    .line 847
    check-cast v12, Lq16;

    .line 848
    .line 849
    iget-object v12, v12, Lq16;->w:Lfq3;

    .line 850
    .line 851
    move-object v13, v9

    .line 852
    check-cast v13, Lzq3;

    .line 853
    .line 854
    invoke-interface {v13}, Lzq3;->q()Z

    .line 855
    .line 856
    .line 857
    move-result v14

    .line 858
    if-nez v14, :cond_23

    .line 859
    .line 860
    move-object v14, v4

    .line 861
    check-cast v14, Lzq3;

    .line 862
    .line 863
    invoke-interface {v14}, Lzq3;->q()Z

    .line 864
    .line 865
    .line 866
    move-result v14

    .line 867
    if-eqz v14, :cond_22

    .line 868
    .line 869
    goto :goto_14

    .line 870
    :cond_22
    move/from16 v29, v33

    .line 871
    .line 872
    goto :goto_15

    .line 873
    :cond_23
    :goto_14
    const/16 v29, 0x1

    .line 874
    .line 875
    :goto_15
    invoke-interface {v13}, Lzq3;->w()Z

    .line 876
    .line 877
    .line 878
    move-result v14

    .line 879
    if-nez v14, :cond_25

    .line 880
    .line 881
    move-object v14, v4

    .line 882
    check-cast v14, Lzq3;

    .line 883
    .line 884
    invoke-interface {v14}, Lzq3;->w()Z

    .line 885
    .line 886
    .line 887
    move-result v14

    .line 888
    if-eqz v14, :cond_24

    .line 889
    .line 890
    goto :goto_16

    .line 891
    :cond_24
    move/from16 v30, v33

    .line 892
    .line 893
    goto :goto_17

    .line 894
    :cond_25
    :goto_16
    const/16 v30, 0x1

    .line 895
    .line 896
    :goto_17
    invoke-interface {v13}, Lzq3;->j()Z

    .line 897
    .line 898
    .line 899
    move-result v14

    .line 900
    if-nez v14, :cond_27

    .line 901
    .line 902
    move-object v14, v4

    .line 903
    check-cast v14, Lzq3;

    .line 904
    .line 905
    invoke-interface {v14}, Lzq3;->j()Z

    .line 906
    .line 907
    .line 908
    move-result v14

    .line 909
    if-eqz v14, :cond_26

    .line 910
    .line 911
    goto :goto_18

    .line 912
    :cond_26
    move/from16 v31, v33

    .line 913
    .line 914
    goto :goto_19

    .line 915
    :cond_27
    :goto_18
    const/16 v31, 0x1

    .line 916
    .line 917
    :goto_19
    invoke-interface {v13}, Lzq3;->m()Z

    .line 918
    .line 919
    .line 920
    move-result v13

    .line 921
    if-nez v13, :cond_29

    .line 922
    .line 923
    move-object v13, v4

    .line 924
    check-cast v13, Lzq3;

    .line 925
    .line 926
    invoke-interface {v13}, Lzq3;->m()Z

    .line 927
    .line 928
    .line 929
    move-result v13

    .line 930
    if-eqz v13, :cond_28

    .line 931
    .line 932
    goto :goto_1a

    .line 933
    :cond_28
    move/from16 v28, v33

    .line 934
    .line 935
    goto :goto_1b

    .line 936
    :cond_29
    :goto_1a
    const/16 v28, 0x1

    .line 937
    .line 938
    :goto_1b
    sget-object v13, Lmb2;->a:Lwu0;

    .line 939
    .line 940
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    invoke-virtual {v13, v9, v4}, Lwu0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 944
    .line 945
    .line 946
    move-result v13

    .line 947
    if-gtz v13, :cond_2a

    .line 948
    .line 949
    goto :goto_1c

    .line 950
    :cond_2a
    move-object v9, v4

    .line 951
    :goto_1c
    invoke-interface {v9}, Lp16;->o()Lel4;

    .line 952
    .line 953
    .line 954
    move-result-object v24

    .line 955
    const/16 v27, 0x0

    .line 956
    .line 957
    const/16 v32, 0x1d

    .line 958
    .line 959
    const/16 v23, 0x0

    .line 960
    .line 961
    const/16 v25, 0x0

    .line 962
    .line 963
    const/16 v26, 0x0

    .line 964
    .line 965
    move-object/from16 v22, v12

    .line 966
    .line 967
    invoke-static/range {v22 .. v32}, Lfq3;->a(Lfq3;Lis3;Lel4;Ljava/lang/Boolean;Lyq3;Ljava/util/List;ZZZZI)Lfq3;

    .line 968
    .line 969
    .line 970
    move-result-object v9

    .line 971
    invoke-interface {v10, v11, v9}, Lp16;->x(Lyq3;Lfq3;)Lp16;

    .line 972
    .line 973
    .line 974
    move-result-object v10

    .line 975
    :cond_2b
    if-nez v10, :cond_2c

    .line 976
    .line 977
    goto :goto_1d

    .line 978
    :cond_2c
    move-object v4, v10

    .line 979
    :cond_2d
    :goto_1d
    invoke-virtual {v2, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-object v10, v6

    .line 983
    :cond_2e
    move/from16 v6, v33

    .line 984
    .line 985
    const/4 v4, 0x1

    .line 986
    goto/16 :goto_d

    .line 987
    .line 988
    :cond_2f
    move/from16 v8, v19

    .line 989
    .line 990
    move/from16 v9, v20

    .line 991
    .line 992
    goto/16 :goto_7

    .line 993
    .line 994
    :cond_30
    const-string v1, "Non-denotable supertypes are not possible. Supertype \'"

    .line 995
    .line 996
    const-string v2, "\' appears non-denotable in class \'"

    .line 997
    .line 998
    invoke-static {v1, v10, v2, v0}, Lkj6;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 999
    .line 1000
    .line 1001
    goto/16 :goto_28

    .line 1002
    .line 1003
    :cond_31
    move/from16 v33, v6

    .line 1004
    .line 1005
    invoke-virtual {v5}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v1

    .line 1009
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v1

    .line 1013
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1014
    .line 1015
    .line 1016
    move-result v4

    .line 1017
    if-eqz v4, :cond_36

    .line 1018
    .line 1019
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v4

    .line 1023
    check-cast v4, Ljava/util/Map$Entry;

    .line 1024
    .line 1025
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v5

    .line 1029
    check-cast v5, Lg62;

    .line 1030
    .line 1031
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v4

    .line 1035
    check-cast v4, Lp16;

    .line 1036
    .line 1037
    if-nez v8, :cond_33

    .line 1038
    .line 1039
    invoke-static {v4}, Lmb2;->e(Lp16;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v6

    .line 1043
    if-eqz v6, :cond_32

    .line 1044
    .line 1045
    goto :goto_1f

    .line 1046
    :cond_32
    move/from16 v6, v33

    .line 1047
    .line 1048
    goto :goto_20

    .line 1049
    :cond_33
    :goto_1f
    const/4 v6, 0x1

    .line 1050
    :goto_20
    if-nez v9, :cond_35

    .line 1051
    .line 1052
    invoke-interface {v4}, Lp16;->M()Z

    .line 1053
    .line 1054
    .line 1055
    move-result v7

    .line 1056
    if-eqz v7, :cond_34

    .line 1057
    .line 1058
    goto :goto_21

    .line 1059
    :cond_34
    move/from16 v7, v33

    .line 1060
    .line 1061
    goto :goto_22

    .line 1062
    :cond_35
    :goto_21
    const/4 v7, 0x1

    .line 1063
    :goto_22
    new-instance v8, Lg62;

    .line 1064
    .line 1065
    iget-object v9, v5, Lg62;->a:Lut6;

    .line 1066
    .line 1067
    iget-object v10, v5, Lg62;->b:Ljava/lang/String;

    .line 1068
    .line 1069
    iget-object v11, v5, Lg62;->c:Ljava/lang/String;

    .line 1070
    .line 1071
    iget-object v12, v5, Lg62;->d:Ljava/util/List;

    .line 1072
    .line 1073
    iget-object v13, v5, Lg62;->e:Ljava/util/ArrayList;

    .line 1074
    .line 1075
    iget-object v14, v5, Lg62;->f:Ljava/util/List;

    .line 1076
    .line 1077
    iget-object v15, v5, Lg62;->g:Ljava/util/List;

    .line 1078
    .line 1079
    iget-boolean v5, v5, Lg62;->h:Z

    .line 1080
    .line 1081
    move/from16 v16, v5

    .line 1082
    .line 1083
    invoke-direct/range {v8 .. v17}, Lg62;-><init>(Lut6;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLgr8;)V

    .line 1084
    .line 1085
    .line 1086
    move-object/from16 v5, v17

    .line 1087
    .line 1088
    invoke-virtual {v2, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move v8, v6

    .line 1092
    move v9, v7

    .line 1093
    goto :goto_1e

    .line 1094
    :cond_36
    move-object/from16 v5, v17

    .line 1095
    .line 1096
    if-nez v3, :cond_3c

    .line 1097
    .line 1098
    invoke-static {v0}, Lmb2;->b(Lgq3;)Ljava/util/Collection;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v1

    .line 1102
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v1

    .line 1106
    :cond_37
    :goto_23
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1107
    .line 1108
    .line 1109
    move-result v3

    .line 1110
    if-eqz v3, :cond_3c

    .line 1111
    .line 1112
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v3

    .line 1116
    check-cast v3, Lp16;

    .line 1117
    .line 1118
    invoke-static {v0, v3}, Lmb2;->d(Loq3;Lp16;)Z

    .line 1119
    .line 1120
    .line 1121
    move-result v4

    .line 1122
    if-nez v4, :cond_37

    .line 1123
    .line 1124
    if-nez v8, :cond_39

    .line 1125
    .line 1126
    invoke-static {v3}, Lmb2;->e(Lp16;)Z

    .line 1127
    .line 1128
    .line 1129
    move-result v4

    .line 1130
    if-eqz v4, :cond_38

    .line 1131
    .line 1132
    goto :goto_24

    .line 1133
    :cond_38
    move/from16 v8, v33

    .line 1134
    .line 1135
    goto :goto_25

    .line 1136
    :cond_39
    :goto_24
    const/4 v8, 0x1

    .line 1137
    :goto_25
    if-nez v9, :cond_3b

    .line 1138
    .line 1139
    invoke-interface {v3}, Lp16;->M()Z

    .line 1140
    .line 1141
    .line 1142
    move-result v4

    .line 1143
    if-eqz v4, :cond_3a

    .line 1144
    .line 1145
    goto :goto_26

    .line 1146
    :cond_3a
    move/from16 v9, v33

    .line 1147
    .line 1148
    goto :goto_27

    .line 1149
    :cond_3b
    :goto_26
    const/4 v9, 0x1

    .line 1150
    :goto_27
    invoke-static {v3, v5}, Lmb2;->h(Lp16;Lgr8;)Lg62;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v4

    .line 1154
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    goto :goto_23

    .line 1158
    :cond_3c
    new-instance v7, Llb2;

    .line 1159
    .line 1160
    invoke-direct {v7, v2, v8, v9}, Llb2;-><init>(Ljava/util/HashMap;ZZ)V

    .line 1161
    .line 1162
    .line 1163
    :goto_28
    return-object v7

    .line 1164
    :pswitch_3
    move/from16 v33, v6

    .line 1165
    .line 1166
    invoke-virtual {v0}, Loq3;->a0()Lgq0;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v1

    .line 1170
    iget-object v2, v0, Loq3;->x:Ljava/lang/Class;

    .line 1171
    .line 1172
    iget-object v0, v0, Loq3;->y:Lnz3;

    .line 1173
    .line 1174
    invoke-interface {v0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v0

    .line 1178
    check-cast v0, Lkq3;

    .line 1179
    .line 1180
    iget-object v0, v0, Lxq3;->a:Ly16;

    .line 1181
    .line 1182
    sget-object v4, Lxq3;->b:[Lyr3;

    .line 1183
    .line 1184
    aget-object v4, v4, v33

    .line 1185
    .line 1186
    invoke-virtual {v0}, Ly16;->b()Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1191
    .line 1192
    .line 1193
    check-cast v0, Lra6;

    .line 1194
    .line 1195
    iget-object v4, v0, Lra6;->a:Lws1;

    .line 1196
    .line 1197
    iget-object v6, v4, Lws1;->b:Lsl4;

    .line 1198
    .line 1199
    iget-boolean v8, v1, Lgq0;->c:Z

    .line 1200
    .line 1201
    if-eqz v8, :cond_3d

    .line 1202
    .line 1203
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 1204
    .line 1205
    .line 1206
    move-result v3

    .line 1207
    if-eqz v3, :cond_3d

    .line 1208
    .line 1209
    iget-object v3, v4, Lws1;->t:Leq0;

    .line 1210
    .line 1211
    sget-object v4, Leq0;->c:Ljava/util/Set;

    .line 1212
    .line 1213
    invoke-virtual {v3, v1, v7}, Leq0;->a(Lgq0;Lxp0;)Lql4;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v3

    .line 1217
    goto :goto_29

    .line 1218
    :cond_3d
    invoke-static {v6, v1}, Lr16;->y(Lsl4;Lgq0;)Lql4;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v3

    .line 1222
    :goto_29
    if-nez v3, :cond_41

    .line 1223
    .line 1224
    invoke-virtual {v2}, Ljava/lang/Class;->isSynthetic()Z

    .line 1225
    .line 1226
    .line 1227
    move-result v3

    .line 1228
    if-eqz v3, :cond_3e

    .line 1229
    .line 1230
    invoke-static {v1, v0}, Loq3;->Z(Lgq0;Lra6;)Lcq0;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v7

    .line 1234
    goto :goto_2c

    .line 1235
    :cond_3e
    invoke-static {v2}, Lub5;->e(Ljava/lang/Class;)Lv16;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v3

    .line 1239
    if-eqz v3, :cond_3f

    .line 1240
    .line 1241
    iget-object v3, v3, Lv16;->b:Lhv3;

    .line 1242
    .line 1243
    iget-object v3, v3, Lhv3;->a:Lgv3;

    .line 1244
    .line 1245
    goto :goto_2a

    .line 1246
    :cond_3f
    move-object v3, v7

    .line 1247
    :goto_2a
    if-nez v3, :cond_40

    .line 1248
    .line 1249
    goto :goto_2b

    .line 1250
    :cond_40
    sget-object v4, Lmq3;->a:[I

    .line 1251
    .line 1252
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1253
    .line 1254
    .line 1255
    move-result v5

    .line 1256
    aget v5, v4, v5

    .line 1257
    .line 1258
    :goto_2b
    const-string v4, " (kind = "

    .line 1259
    .line 1260
    packed-switch v5, :pswitch_data_1

    .line 1261
    .line 1262
    .line 1263
    :pswitch_4
    invoke-static {}, Lh;->c()V

    .line 1264
    .line 1265
    .line 1266
    goto :goto_2c

    .line 1267
    :pswitch_5
    const-string v0, "Unknown class: "

    .line 1268
    .line 1269
    invoke-static {v0, v2, v4, v3}, Lh;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1270
    .line 1271
    .line 1272
    goto :goto_2c

    .line 1273
    :pswitch_6
    invoke-static {v1, v0}, Loq3;->Z(Lgq0;Lra6;)Lcq0;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v7

    .line 1277
    goto :goto_2c

    .line 1278
    :pswitch_7
    const-string v0, "Unresolved class: "

    .line 1279
    .line 1280
    invoke-static {v0, v2, v4, v3}, Lh;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1281
    .line 1282
    .line 1283
    goto :goto_2c

    .line 1284
    :cond_41
    move-object v7, v3

    .line 1285
    :goto_2c
    return-object v7

    .line 1286
    :pswitch_8
    invoke-virtual {v0}, Loq3;->c0()Lql4;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v1

    .line 1290
    invoke-virtual {v1}, Lql4;->L()Lji4;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v1

    .line 1294
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1295
    .line 1296
    .line 1297
    invoke-static {v0, v1, v2}, Loq3;->Y(Loq3;Lji4;Llq3;)Ljava/util/List;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v0

    .line 1301
    return-object v0

    .line 1302
    :pswitch_9
    invoke-virtual {v0}, Loq3;->c0()Lql4;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v1

    .line 1306
    invoke-virtual {v1}, Lql4;->g0()Lfu6;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v1

    .line 1310
    invoke-virtual {v1}, Lvw3;->R()Lji4;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v1

    .line 1314
    invoke-static {v0, v1, v2}, Loq3;->Y(Loq3;Lji4;Llq3;)Ljava/util/List;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v0

    .line 1318
    return-object v0

    .line 1319
    :pswitch_a
    invoke-virtual {v0}, Loq3;->c0()Lql4;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v1

    .line 1323
    invoke-virtual {v1}, Lql4;->g0()Lfu6;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v1

    .line 1327
    invoke-virtual {v1}, Lvw3;->R()Lji4;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v1

    .line 1331
    sget-object v2, Llq3;->w:Llq3;

    .line 1332
    .line 1333
    invoke-static {v0, v1, v2}, Loq3;->Y(Loq3;Lji4;Llq3;)Ljava/util/List;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v0

    .line 1337
    return-object v0

    .line 1338
    :pswitch_b
    new-instance v1, Lkq3;

    .line 1339
    .line 1340
    invoke-direct {v1, v0}, Lkq3;-><init>(Loq3;)V

    .line 1341
    .line 1342
    .line 1343
    return-object v1

    .line 1344
    nop

    .line 1345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_7
        :pswitch_4
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_7
    .end packed-switch
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
.end method
