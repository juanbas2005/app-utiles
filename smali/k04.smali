.class public final synthetic Lk04;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Lk04;->w:I

    iput-object p3, p0, Lk04;->y:Ljava/lang/Object;

    iput p1, p0, Lk04;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/Collection;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lk04;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lk04;->x:I

    .line 8
    .line 9
    iput-object p2, p0, Lk04;->y:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
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


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lk04;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lk04;->y:Ljava/lang/Object;

    .line 7
    .line 8
    iget p0, p0, Lk04;->x:I

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v3, Ljava/util/Collection;

    .line 14
    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p1, p0, v3}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast v3, Lim5;

    .line 27
    .line 28
    check-cast p1, Ly53;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v0, p1, Ly53;->c:Ldz2;

    .line 34
    .line 35
    iget-object v4, v3, Lim5;->b:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v5, v3, Lim5;->c:Li53;

    .line 38
    .line 39
    invoke-virtual {p1, v5}, Ly53;->d(Li53;)V

    .line 40
    .line 41
    .line 42
    sget-object v5, Ll51;->c:Lq51;

    .line 43
    .line 44
    invoke-static {p1, v5}, Lpv8;->q(Lh53;Lq51;)V

    .line 45
    .line 46
    .line 47
    iget-object v5, v3, Lim5;->e:Lkotlinx/serialization/json/JsonElement;

    .line 48
    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    iput-object v5, p1, Ly53;->d:Ljava/lang/Object;

    .line 52
    .line 53
    sget-object v5, Lb26;->a:Lc26;

    .line 54
    .line 55
    const-class v6, Lkotlinx/serialization/json/JsonElement;

    .line 56
    .line 57
    invoke-virtual {v5, v6}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    :try_start_0
    invoke-static {v6}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 62
    .line 63
    .line 64
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-object v6, v2

    .line 67
    :goto_0
    new-instance v7, Lfp7;

    .line 68
    .line 69
    invoke-direct {v7, v5, v6}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v7}, Ly53;->b(Lfp7;)V

    .line 73
    .line 74
    .line 75
    :cond_0
    invoke-static {v4}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-nez v5, :cond_3

    .line 80
    .line 81
    iget-object v5, v3, Lim5;->c:Li53;

    .line 82
    .line 83
    sget-object v6, Li53;->b:Li53;

    .line 84
    .line 85
    invoke-static {v5, v6}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-nez v6, :cond_2

    .line 90
    .line 91
    sget-object v6, Li53;->g:Li53;

    .line 92
    .line 93
    invoke-static {v5, v6}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    const-string v5, "Content-Profile"

    .line 101
    .line 102
    invoke-static {p1, v5, v4}, Lb35;->t(Lh53;Ljava/lang/String;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_2
    :goto_1
    const-string v5, "Accept-Profile"

    .line 107
    .line 108
    invoke-static {p1, v5, v4}, Lb35;->t(Lh53;Ljava/lang/String;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    :goto_2
    iget-object v4, v3, Lim5;->d:Ld4;

    .line 112
    .line 113
    sget-object v5, Lb4;->a:Lb4;

    .line 114
    .line 115
    invoke-static {v4, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_4

    .line 120
    .line 121
    const-string v2, "text/csv"

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_4
    sget-object v5, Lc4;->a:Lc4;

    .line 125
    .line 126
    invoke-static {v4, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eqz v5, :cond_5

    .line 131
    .line 132
    const-string v2, "application/geo+json"

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_5
    sget-object v5, Ld4;->a:Ld4;

    .line 136
    .line 137
    invoke-static {v4, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_6

    .line 142
    .line 143
    const-string v2, "application/json"

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_6
    sget-object v5, Le4;->a:Le4;

    .line 147
    .line 148
    invoke-static {v4, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_9

    .line 153
    .line 154
    const-string v2, ""

    .line 155
    .line 156
    const-string v4, "application/vnd.pgrst.object+json"

    .line 157
    .line 158
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    :goto_3
    const-string v4, "Accept"

    .line 163
    .line 164
    invoke-static {p1, v4, v2}, Lb35;->t(Lh53;Ljava/lang/String;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    new-instance v2, Lsn6;

    .line 168
    .line 169
    invoke-direct {v2}, Lsn6;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Lim5;->a()Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-virtual {v2, v4}, Lsn6;->addAll(Ljava/util/Collection;)Z

    .line 177
    .line 178
    .line 179
    invoke-static {v2}, Lwn6;->d(Lsn6;)Lsn6;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    const/4 v9, 0x0

    .line 184
    const/16 v10, 0x3e

    .line 185
    .line 186
    const-string v6, ","

    .line 187
    .line 188
    const/4 v7, 0x0

    .line 189
    const/4 v8, 0x0

    .line 190
    invoke-static/range {v5 .. v10}, Ldt0;->E0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvr2;I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    const-string v4, "Prefer"

    .line 195
    .line 196
    invoke-static {p1, v4, v2}, Lb35;->t(Lh53;Ljava/lang/String;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    iget-object p1, p1, Ly53;->a:Lyr7;

    .line 200
    .line 201
    iget-object p1, p1, Lyr7;->j:Lv70;

    .line 202
    .line 203
    iget-object v2, v3, Lim5;->f:Ljava/util/LinkedHashMap;

    .line 204
    .line 205
    sget v4, Lm18;->a:I

    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 211
    .line 212
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    invoke-static {v5}, Ltf4;->F(I)I

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    invoke-direct {v4, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    check-cast v2, Ljava/lang/Iterable;

    .line 228
    .line 229
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-eqz v5, :cond_7

    .line 238
    .line 239
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    check-cast v5, Ljava/util/Map$Entry;

    .line 244
    .line 245
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    check-cast v5, Ljava/util/List;

    .line 254
    .line 255
    invoke-static {v5}, Ldt0;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    if-eqz v4, :cond_8

    .line 279
    .line 280
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    check-cast v4, Ljava/util/Map$Entry;

    .line 285
    .line 286
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    check-cast v5, Ljava/lang/String;

    .line 291
    .line 292
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    check-cast v4, Ljava/lang/String;

    .line 297
    .line 298
    invoke-virtual {p1, v5, v4}, Lv70;->p0(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_8
    iget-object p1, v3, Lim5;->g:Ldz2;

    .line 303
    .line 304
    invoke-static {v0, p1}, Lo55;->b(La57;La57;)V

    .line 305
    .line 306
    .line 307
    if-lez p0, :cond_a

    .line 308
    .line 309
    const-string p1, "x-retry-count"

    .line 310
    .line 311
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    invoke-virtual {v0, p1, p0}, Lin8;->p0(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_9
    invoke-static {}, Lh;->c()V

    .line 320
    .line 321
    .line 322
    move-object v1, v2

    .line 323
    :cond_a
    :goto_6
    return-object v1

    .line 324
    :pswitch_1
    check-cast v3, Ln04;

    .line 325
    .line 326
    check-cast p1, Lr24;

    .line 327
    .line 328
    iget-object v0, v3, Ln04;->a:Llm1;

    .line 329
    .line 330
    invoke-static {}, Lj45;->h()Lix6;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    if-eqz v3, :cond_b

    .line 335
    .line 336
    invoke-virtual {v3}, Lix6;->e()Lvr2;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    :cond_b
    invoke-static {v3}, Lj45;->j(Lix6;)Lix6;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    invoke-static {v3, v4, v2}, Lj45;->m(Lix6;Lix6;Lvr2;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    iget v0, p1, Lr24;->a:I

    .line 351
    .line 352
    const/4 v2, -0x1

    .line 353
    if-ne v0, v2, :cond_c

    .line 354
    .line 355
    const/4 v0, 0x2

    .line 356
    :cond_c
    const/4 v2, 0x0

    .line 357
    :goto_7
    if-ge v2, v0, :cond_d

    .line 358
    .line 359
    add-int v3, p0, v2

    .line 360
    .line 361
    invoke-virtual {p1, v3}, Lr24;->a(I)V

    .line 362
    .line 363
    .line 364
    add-int/lit8 v2, v2, 0x1

    .line 365
    .line 366
    goto :goto_7

    .line 367
    :cond_d
    return-object v1

    .line 368
    nop

    .line 369
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method
