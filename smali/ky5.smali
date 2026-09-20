.class public final Lky5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lq54;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lky5;->w:I

    .line 2
    .line 3
    iput-object p2, p0, Lky5;->x:Ljava/lang/Object;

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


# virtual methods
.method public final o(Lt54;Lj54;)V
    .locals 6

    .line 1
    iget v0, p0, Lky5;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lky5;->x:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lj54;->ON_CREATE:Lj54;

    .line 11
    .line 12
    if-ne p2, v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Lt54;->k()Lin8;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, p0}, Lin8;->M0(Ls54;)V

    .line 19
    .line 20
    .line 21
    check-cast v2, Ldf6;

    .line 22
    .line 23
    invoke-virtual {v2}, Ldf6;->b()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "Next event must be ON_CREATE, it was "

    .line 28
    .line 29
    invoke-static {p0, p2}, Lku4;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :pswitch_0
    sget-object p0, Lj54;->ON_STOP:Lj54;

    .line 34
    .line 35
    if-ne p2, p0, :cond_1

    .line 36
    .line 37
    check-cast v2, Lbq2;

    .line 38
    .line 39
    iget-object p0, v2, Lbq2;->c0:Landroid/view/View;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void

    .line 47
    :pswitch_1
    new-instance p0, Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 50
    .line 51
    .line 52
    check-cast v2, [Llu2;

    .line 53
    .line 54
    array-length p0, v2

    .line 55
    if-gtz p0, :cond_3

    .line 56
    .line 57
    array-length p0, v2

    .line 58
    if-gtz p0, :cond_2

    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    aget-object p0, v2, v1

    .line 62
    .line 63
    throw v3

    .line 64
    :cond_3
    aget-object p0, v2, v1

    .line 65
    .line 66
    throw v3

    .line 67
    :pswitch_2
    check-cast v2, Lrv0;

    .line 68
    .line 69
    iget-object p1, v2, Lrv0;->A:Lz58;

    .line 70
    .line 71
    if-nez p1, :cond_5

    .line 72
    .line 73
    invoke-virtual {v2}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Lnv0;

    .line 78
    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    iget-object p1, p1, Lnv0;->a:Lz58;

    .line 82
    .line 83
    iput-object p1, v2, Lrv0;->A:Lz58;

    .line 84
    .line 85
    :cond_4
    iget-object p1, v2, Lrv0;->A:Lz58;

    .line 86
    .line 87
    if-nez p1, :cond_5

    .line 88
    .line 89
    new-instance p1, Lz58;

    .line 90
    .line 91
    invoke-direct {p1}, Lz58;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object p1, v2, Lrv0;->A:Lz58;

    .line 95
    .line 96
    :cond_5
    iget-object p1, v2, Lqv0;->w:Lw54;

    .line 97
    .line 98
    invoke-virtual {p1, p0}, Lw54;->M0(Ls54;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_3
    check-cast v2, Lif6;

    .line 103
    .line 104
    sget-object v0, Lj54;->ON_CREATE:Lj54;

    .line 105
    .line 106
    if-ne p2, v0, :cond_d

    .line 107
    .line 108
    invoke-interface {p1}, Lt54;->k()Lin8;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1, p0}, Lin8;->M0(Ls54;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v2}, Lif6;->h()Lkg5;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    const-string p1, "androidx.savedstate.Restarter"

    .line 120
    .line 121
    invoke-virtual {p0, p1}, Lkg5;->i(Ljava/lang/String;)Landroid/os/Bundle;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    if-nez p0, :cond_6

    .line 126
    .line 127
    goto/16 :goto_3

    .line 128
    .line 129
    :cond_6
    const-string p1, "classes_to_restore"

    .line 130
    .line 131
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-eqz p0, :cond_b

    .line 136
    .line 137
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    :cond_7
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_c

    .line 146
    .line 147
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast p1, Ljava/lang/String;

    .line 152
    .line 153
    const-string p2, "Class "

    .line 154
    .line 155
    :try_start_0
    const-class v0, Lky5;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {p1, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const-class v4, Lff6;

    .line 166
    .line 167
    invoke-virtual {v0, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 172
    .line 173
    .line 174
    :try_start_1
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 175
    .line 176
    .line 177
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 178
    const/4 v0, 0x1

    .line 179
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 180
    .line 181
    .line 182
    :try_start_2
    invoke-virtual {p2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    check-cast p2, Lff6;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 190
    .line 191
    instance-of p1, v2, La68;

    .line 192
    .line 193
    if-eqz p1, :cond_a

    .line 194
    .line 195
    move-object p1, v2

    .line 196
    check-cast p1, La68;

    .line 197
    .line 198
    invoke-interface {p1}, La68;->g()Lz58;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-interface {v2}, Lif6;->h()Lkg5;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    iget-object v0, p1, Lz58;->a:Ljava/util/LinkedHashMap;

    .line 207
    .line 208
    iget-object p1, p1, Lz58;->a:Ljava/util/LinkedHashMap;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, Ljava/lang/Iterable;

    .line 215
    .line 216
    invoke-static {v0}, Ldt0;->g1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-eqz v4, :cond_9

    .line 229
    .line 230
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {p1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    check-cast v4, Lr58;

    .line 239
    .line 240
    if-nez v4, :cond_8

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_8
    invoke-interface {v2}, Lt54;->k()Lin8;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-static {v4, p2, v5}, Lpv8;->n(Lr58;Lkg5;Lin8;)V

    .line 248
    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_9
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    check-cast p1, Ljava/lang/Iterable;

    .line 256
    .line 257
    invoke-static {p1}, Ldt0;->g1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    check-cast p1, Ljava/util/Collection;

    .line 262
    .line 263
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    if-nez p1, :cond_7

    .line 268
    .line 269
    invoke-virtual {p2}, Lkg5;->O()V

    .line 270
    .line 271
    .line 272
    goto/16 :goto_1

    .line 273
    .line 274
    :cond_a
    const-string p0, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: "

    .line 275
    .line 276
    invoke-static {p0, v2}, Lku4;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    goto :goto_3

    .line 280
    :catch_0
    move-exception p0

    .line 281
    const-string p2, "Failed to instantiate "

    .line 282
    .line 283
    invoke-static {p2, p1}, Lb81;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-static {p1, p0}, Lku4;->o(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 288
    .line 289
    .line 290
    goto :goto_3

    .line 291
    :catch_1
    move-exception p0

    .line 292
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    new-instance v1, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const-string p2, " must have default constructor in order to be automatically recreated"

    .line 307
    .line 308
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p2

    .line 315
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    throw p1

    .line 319
    :catch_2
    move-exception p0

    .line 320
    const-string v0, " wasn\'t found"

    .line 321
    .line 322
    invoke-static {p2, p1, v0}, Lf21;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    invoke-static {p1, p0}, Lku4;->o(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    .line 328
    .line 329
    goto :goto_3

    .line 330
    :cond_b
    const-string p0, "SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 331
    .line 332
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    :cond_c
    :goto_3
    return-void

    .line 336
    :cond_d
    new-instance p0, Ljava/lang/AssertionError;

    .line 337
    .line 338
    const-string p1, "Next event must be ON_CREATE"

    .line 339
    .line 340
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    throw p0

    .line 344
    nop

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
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
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method
