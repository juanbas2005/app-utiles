.class public final synthetic Lqm3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Lqm3;->w:I

    iput-object p2, p0, Lqm3;->x:Ljava/lang/Object;

    iput-object p3, p0, Lqm3;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lft4;Lzs4;Z)V
    .locals 0

    .line 1
    const/4 p3, 0x7

    .line 2
    iput p3, p0, Lqm3;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqm3;->x:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lqm3;->y:Ljava/lang/Object;

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
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lqm3;->w:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const v2, 0x3f59999a    # 0.85f

    .line 5
    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lq07;

    .line 17
    .line 18
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Laq4;

    .line 21
    .line 22
    invoke-interface {p0, v0}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lvs7;->a:Lvs7;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Landroid/content/Context;

    .line 31
    .line 32
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Lo11;

    .line 35
    .line 36
    iget-object v1, p0, Lo11;->h:Ljava/lang/Double;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    iget-object p0, p0, Lo11;->i:Ljava/lang/Double;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    const-string p0, ","

    .line 55
    .line 56
    const-string v5, "geo:"

    .line 57
    .line 58
    :try_start_0
    new-instance v6, Landroid/content/Intent;

    .line 59
    .line 60
    const-string v7, "android.intent.action.VIEW"

    .line 61
    .line 62
    new-instance v8, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v5, "?q="

    .line 77
    .line 78
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-direct {v6, v7, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    :catchall_0
    sget-object p0, Lvs7;->a:Lvs7;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_1
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;

    .line 113
    .line 114
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, Landroid/view/WindowManager$LayoutParams;

    .line 117
    .line 118
    sget-object v1, Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;->K:Ld37;

    .line 119
    .line 120
    iget p0, p0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 121
    .line 122
    int-to-float p0, p0

    .line 123
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 132
    .line 133
    int-to-float v1, v1

    .line 134
    mul-float/2addr v1, v2

    .line 135
    cmpl-float p0, p0, v1

    .line 136
    .line 137
    if-ltz p0, :cond_0

    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_0
    iget-object p0, v0, Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;->J:Ld37;

    .line 144
    .line 145
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v6, v0}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    :goto_0
    sget-object p0, Lvs7;->a:Lvs7;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_2
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Lnw6;

    .line 159
    .line 160
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p0, Lib2;

    .line 163
    .line 164
    iget-object v1, p0, Lib2;->a:Ljava/lang/Object;

    .line 165
    .line 166
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-nez v1, :cond_1

    .line 171
    .line 172
    iget-object v1, p0, Lib2;->b:Ljava/util/ArrayList;

    .line 173
    .line 174
    new-instance v2, Lay5;

    .line 175
    .line 176
    const/16 v3, 0xf

    .line 177
    .line 178
    invoke-direct {v2, v3, v0}, Lay5;-><init>(ILjava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-static {v1, v2}, Lit0;->i0(Ljava/util/List;Lvr2;)V

    .line 182
    .line 183
    .line 184
    iget-object p0, p0, Lib2;->c:Lyx5;

    .line 185
    .line 186
    if-eqz p0, :cond_1

    .line 187
    .line 188
    iget-object v0, p0, Lyx5;->a:Lzx5;

    .line 189
    .line 190
    if-eqz v0, :cond_1

    .line 191
    .line 192
    invoke-interface {v0, p0, v6}, Lzx5;->p(Lyx5;Ljava/lang/Object;)Ldh3;

    .line 193
    .line 194
    .line 195
    :cond_1
    sget-object p0, Lvs7;->a:Lvs7;

    .line 196
    .line 197
    return-object p0

    .line 198
    :pswitch_3
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, Lsr2;

    .line 201
    .line 202
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p0, Lad5;

    .line 205
    .line 206
    invoke-virtual {p0}, Lad5;->d()F

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    const/high16 v2, 0x43b40000    # 360.0f

    .line 211
    .line 212
    add-float/2addr v1, v2

    .line 213
    invoke-virtual {p0, v1}, Lad5;->e(F)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    sget-object p0, Lvs7;->a:Lvs7;

    .line 220
    .line 221
    return-object p0

    .line 222
    :pswitch_4
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Lfq6;

    .line 225
    .line 226
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast p0, Laq4;

    .line 229
    .line 230
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    check-cast p0, Lis7;

    .line 235
    .line 236
    iget-object p0, p0, Lis7;->a:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast p0, Lzn6;

    .line 239
    .line 240
    iget p0, p0, Lzn6;->f:I

    .line 241
    .line 242
    if-eqz p0, :cond_2

    .line 243
    .line 244
    if-eq p0, v4, :cond_3

    .line 245
    .line 246
    move v1, v5

    .line 247
    goto :goto_1

    .line 248
    :cond_2
    move v1, v4

    .line 249
    :cond_3
    :goto_1
    invoke-virtual {v0, v1}, Lfq6;->e(I)V

    .line 250
    .line 251
    .line 252
    sget-object p0, Lvs7;->a:Lvs7;

    .line 253
    .line 254
    return-object p0

    .line 255
    :pswitch_5
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v0, Lw34;

    .line 258
    .line 259
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 262
    .line 263
    sget-object v1, Lur6;->b:Ljava/lang/Object;

    .line 264
    .line 265
    monitor-enter v1

    .line 266
    :try_start_1
    sget-object v2, Lur6;->c:Ljava/util/LinkedHashMap;

    .line 267
    .line 268
    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_4

    .line 276
    .line 277
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    sget-object v2, Lbd8;->a:Ljava/lang/String;

    .line 282
    .line 283
    const-string v3, "NetworkRequestConstraintController unregister shared callback"

    .line 284
    .line 285
    invoke-virtual {v0, v2, v3}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    sget-object v0, Lur6;->a:Lur6;

    .line 289
    .line 290
    invoke-virtual {p0, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 291
    .line 292
    .line 293
    sput-object v6, Lur6;->f:Ljava/lang/Boolean;

    .line 294
    .line 295
    sput-object v6, Lur6;->d:Landroid/net/NetworkCapabilities;

    .line 296
    .line 297
    sput-boolean v5, Lur6;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 298
    .line 299
    goto :goto_2

    .line 300
    :catchall_1
    move-exception v0

    .line 301
    move-object p0, v0

    .line 302
    goto :goto_3

    .line 303
    :cond_4
    :goto_2
    monitor-exit v1

    .line 304
    sget-object p0, Lvs7;->a:Lvs7;

    .line 305
    .line 306
    return-object p0

    .line 307
    :goto_3
    monitor-exit v1

    .line 308
    throw p0

    .line 309
    :pswitch_6
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v0, Ljava/lang/String;

    .line 312
    .line 313
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast p0, Lci6;

    .line 316
    .line 317
    sget-object v1, Lyk5;->m:Lyk5;

    .line 318
    .line 319
    new-array v2, v5, [Lll6;

    .line 320
    .line 321
    new-instance v3, Lbi6;

    .line 322
    .line 323
    invoke-direct {v3, p0, v5}, Lbi6;-><init>(Lci6;I)V

    .line 324
    .line 325
    .line 326
    invoke-static {v0, v1, v2, v3}, Lb85;->f(Ljava/lang/String;Ln85;[Lll6;Lvr2;)Lnl6;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    return-object p0

    .line 331
    :pswitch_7
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v0, Lvr2;

    .line 334
    .line 335
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast p0, Lhi1;

    .line 338
    .line 339
    invoke-virtual {p0}, Lhi1;->b()Ljava/lang/Long;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    if-eqz p0, :cond_5

    .line 344
    .line 345
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 346
    .line 347
    .line 348
    move-result-wide v1

    .line 349
    const-string p0, "UTC"

    .line 350
    .line 351
    invoke-static {p0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    invoke-static {p0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    invoke-virtual {p0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 360
    .line 361
    .line 362
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-virtual {v1}, Ljava/util/Calendar;->clear()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    invoke-virtual {p0, v3}, Ljava/util/Calendar;->get(I)I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    const/4 v4, 0x5

    .line 378
    invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I

    .line 379
    .line 380
    .line 381
    move-result p0

    .line 382
    invoke-virtual {v1, v2, v3, p0}, Ljava/util/Calendar;->set(III)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 386
    .line 387
    .line 388
    move-result-wide v1

    .line 389
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    :cond_5
    invoke-interface {v0, v6}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    sget-object p0, Lvs7;->a:Lvs7;

    .line 397
    .line 398
    return-object p0

    .line 399
    :pswitch_8
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v0, Lk26;

    .line 402
    .line 403
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast p0, Ljava/lang/CharSequence;

    .line 406
    .line 407
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    iget-object v0, v0, Lk26;->w:Ljava/util/regex/Pattern;

    .line 414
    .line 415
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    invoke-static {v0, v5, p0}, Lt35;->g(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lxf4;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    return-object p0

    .line 427
    :pswitch_9
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v0, Lup4;

    .line 430
    .line 431
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast p0, Lpy0;

    .line 434
    .line 435
    iget-object v1, v0, Lup4;->b:[Ljava/lang/Object;

    .line 436
    .line 437
    iget-object v0, v0, Lup4;->a:[J

    .line 438
    .line 439
    array-length v2, v0

    .line 440
    sub-int/2addr v2, v3

    .line 441
    if-ltz v2, :cond_9

    .line 442
    .line 443
    move v3, v5

    .line 444
    :goto_4
    aget-wide v6, v0, v3

    .line 445
    .line 446
    not-long v8, v6

    .line 447
    const/4 v4, 0x7

    .line 448
    shl-long/2addr v8, v4

    .line 449
    and-long/2addr v8, v6

    .line 450
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    and-long/2addr v8, v10

    .line 456
    cmp-long v4, v8, v10

    .line 457
    .line 458
    if-eqz v4, :cond_8

    .line 459
    .line 460
    sub-int v4, v3, v2

    .line 461
    .line 462
    not-int v4, v4

    .line 463
    ushr-int/lit8 v4, v4, 0x1f

    .line 464
    .line 465
    const/16 v8, 0x8

    .line 466
    .line 467
    rsub-int/lit8 v4, v4, 0x8

    .line 468
    .line 469
    move v9, v5

    .line 470
    :goto_5
    if-ge v9, v4, :cond_7

    .line 471
    .line 472
    const-wide/16 v10, 0xff

    .line 473
    .line 474
    and-long/2addr v10, v6

    .line 475
    const-wide/16 v12, 0x80

    .line 476
    .line 477
    cmp-long v10, v10, v12

    .line 478
    .line 479
    if-gez v10, :cond_6

    .line 480
    .line 481
    shl-int/lit8 v10, v3, 0x3

    .line 482
    .line 483
    add-int/2addr v10, v9

    .line 484
    aget-object v10, v1, v10

    .line 485
    .line 486
    invoke-virtual {p0, v10}, Lpy0;->B(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    :cond_6
    shr-long/2addr v6, v8

    .line 490
    add-int/lit8 v9, v9, 0x1

    .line 491
    .line 492
    goto :goto_5

    .line 493
    :cond_7
    if-ne v4, v8, :cond_9

    .line 494
    .line 495
    :cond_8
    if-eq v3, v2, :cond_9

    .line 496
    .line 497
    add-int/lit8 v3, v3, 0x1

    .line 498
    .line 499
    goto :goto_4

    .line 500
    :cond_9
    sget-object p0, Lvs7;->a:Lvs7;

    .line 501
    .line 502
    return-object p0

    .line 503
    :pswitch_a
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 504
    .line 505
    move-object v5, v0

    .line 506
    check-cast v5, Lrv0;

    .line 507
    .line 508
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 509
    .line 510
    move-object v4, p0

    .line 511
    check-cast v4, Llq5;

    .line 512
    .line 513
    if-eqz v5, :cond_a

    .line 514
    .line 515
    iget-object v2, v4, Llq5;->c:Ld37;

    .line 516
    .line 517
    invoke-virtual {v2}, Ld37;->getValue()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object p0

    .line 521
    check-cast p0, Lis7;

    .line 522
    .line 523
    iget-boolean p0, p0, Lis7;->b:Z

    .line 524
    .line 525
    if-nez p0, :cond_a

    .line 526
    .line 527
    invoke-static {v4}, Lu58;->a(Lr58;)Lls0;

    .line 528
    .line 529
    .line 530
    move-result-object p0

    .line 531
    new-instance v1, Lii3;

    .line 532
    .line 533
    const/16 v6, 0xe

    .line 534
    .line 535
    const/4 v3, 0x0

    .line 536
    invoke-direct/range {v1 .. v6}, Lii3;-><init>(Ld37;Lf61;Lr58;Ljava/lang/Object;I)V

    .line 537
    .line 538
    .line 539
    const/4 v0, 0x3

    .line 540
    invoke-static {p0, v3, v3, v1, v0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 541
    .line 542
    .line 543
    :cond_a
    sget-object p0, Lvs7;->a:Lvs7;

    .line 544
    .line 545
    return-object p0

    .line 546
    :pswitch_b
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 547
    .line 548
    check-cast v0, Lvr2;

    .line 549
    .line 550
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast p0, Lcf5;

    .line 553
    .line 554
    invoke-interface {v0, p0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    sget-object p0, Lvs7;->a:Lvs7;

    .line 558
    .line 559
    return-object p0

    .line 560
    :pswitch_c
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v0, Landroid/content/Context;

    .line 563
    .line 564
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast p0, Lhn5;

    .line 567
    .line 568
    iget-object p0, p0, Lhn5;->a:Ljava/lang/String;

    .line 569
    .line 570
    const-string v1, ".preferences_pb"

    .line 571
    .line 572
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object p0

    .line 576
    invoke-static {v0, p0}, Lmp7;->T(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 577
    .line 578
    .line 579
    move-result-object p0

    .line 580
    return-object p0

    .line 581
    :pswitch_d
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v0, Lmx0;

    .line 584
    .line 585
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast p0, Lgs2;

    .line 588
    .line 589
    iput-object p0, v0, Lmx0;->d:Lgs2;

    .line 590
    .line 591
    sget-object p0, Lvs7;->a:Lvs7;

    .line 592
    .line 593
    return-object p0

    .line 594
    :pswitch_e
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 595
    .line 596
    check-cast v0, Lvr2;

    .line 597
    .line 598
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 599
    .line 600
    check-cast p0, Lbd5;

    .line 601
    .line 602
    invoke-virtual {p0}, Lbd5;->d()I

    .line 603
    .line 604
    .line 605
    move-result p0

    .line 606
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 607
    .line 608
    .line 609
    move-result-object p0

    .line 610
    invoke-interface {v0, p0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    sget-object p0, Lvs7;->a:Lvs7;

    .line 614
    .line 615
    return-object p0

    .line 616
    :pswitch_f
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v0, Le81;

    .line 619
    .line 620
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 621
    .line 622
    check-cast p0, Lj85;

    .line 623
    .line 624
    sget-object v1, Lcw2;->w:Lcw2;

    .line 625
    .line 626
    new-instance v2, Lk05;

    .line 627
    .line 628
    invoke-direct {v2, p0, v6, v4}, Lk05;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 629
    .line 630
    .line 631
    invoke-static {v1, v0, v2, v3}, Lgr8;->b0(Lo81;Le81;Lgs2;I)Lk68;

    .line 632
    .line 633
    .line 634
    move-result-object p0

    .line 635
    iget-object p0, p0, Lk68;->x:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast p0, Laf0;

    .line 638
    .line 639
    return-object p0

    .line 640
    :pswitch_10
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v0, Ljava/lang/String;

    .line 643
    .line 644
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 645
    .line 646
    check-cast p0, La62;

    .line 647
    .line 648
    sget-object v1, Ln57;->o:Ln57;

    .line 649
    .line 650
    new-array v2, v5, [Lll6;

    .line 651
    .line 652
    new-instance v3, Lh43;

    .line 653
    .line 654
    const/16 v4, 0x17

    .line 655
    .line 656
    invoke-direct {v3, v4, p0}, Lh43;-><init>(ILjava/lang/Object;)V

    .line 657
    .line 658
    .line 659
    invoke-static {v0, v1, v2, v3}, Lb85;->f(Ljava/lang/String;Ln85;[Lll6;Lvr2;)Lnl6;

    .line 660
    .line 661
    .line 662
    move-result-object p0

    .line 663
    return-object p0

    .line 664
    :pswitch_11
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 665
    .line 666
    check-cast v0, Lf06;

    .line 667
    .line 668
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 669
    .line 670
    check-cast p0, Lz15;

    .line 671
    .line 672
    new-instance v1, Ljava/lang/StringBuilder;

    .line 673
    .line 674
    const-string v2, "Only found "

    .line 675
    .line 676
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    iget v0, v0, Lf06;->w:I

    .line 680
    .line 681
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    const-string v0, " digits in a row, but need to parse "

    .line 685
    .line 686
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {p0}, Lz15;->b()Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object p0

    .line 693
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object p0

    .line 700
    return-object p0

    .line 701
    :pswitch_12
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 702
    .line 703
    check-cast v0, Lcf4;

    .line 704
    .line 705
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 706
    .line 707
    check-cast p0, Lby5;

    .line 708
    .line 709
    iget-object v0, v0, Lcf4;->x:Ljava/lang/Object;

    .line 710
    .line 711
    check-cast v0, Lyt;

    .line 712
    .line 713
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 714
    .line 715
    .line 716
    move-result v0

    .line 717
    if-eqz v0, :cond_b

    .line 718
    .line 719
    goto :goto_6

    .line 720
    :cond_b
    invoke-virtual {p0}, Lby5;->b()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    :goto_6
    sget-object p0, Lvs7;->a:Lvs7;

    .line 724
    .line 725
    return-object p0

    .line 726
    :pswitch_13
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast v0, Laz4;

    .line 729
    .line 730
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast p0, Lzy4;

    .line 733
    .line 734
    iget-object v0, v0, Laz4;->a:Landroid/net/ConnectivityManager;

    .line 735
    .line 736
    invoke-virtual {v0, p0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 737
    .line 738
    .line 739
    sget-object p0, Lvs7;->a:Lvs7;

    .line 740
    .line 741
    return-object p0

    .line 742
    :pswitch_14
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 743
    .line 744
    check-cast v0, Lxz1;

    .line 745
    .line 746
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast p0, Lad5;

    .line 749
    .line 750
    invoke-virtual {p0}, Lad5;->d()F

    .line 751
    .line 752
    .line 753
    move-result p0

    .line 754
    iget-object v0, v0, Lxz1;->b:Lbd;

    .line 755
    .line 756
    invoke-virtual {v0}, Lbd;->e()F

    .line 757
    .line 758
    .line 759
    move-result v0

    .line 760
    sub-float/2addr v0, p0

    .line 761
    const/4 v1, 0x0

    .line 762
    sub-float p0, v1, p0

    .line 763
    .line 764
    div-float/2addr v0, p0

    .line 765
    const/high16 p0, 0x3f800000    # 1.0f

    .line 766
    .line 767
    invoke-static {v0, v1, p0}, Lz65;->o(FFF)F

    .line 768
    .line 769
    .line 770
    move-result p0

    .line 771
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 772
    .line 773
    .line 774
    move-result-object p0

    .line 775
    return-object p0

    .line 776
    :pswitch_15
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v0, Lft4;

    .line 779
    .line 780
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast p0, Lzs4;

    .line 783
    .line 784
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 785
    .line 786
    .line 787
    iget-object v1, v0, Lft4;->a:Lor2;

    .line 788
    .line 789
    monitor-enter v1

    .line 790
    :try_start_2
    iget-object v0, v0, Lft4;->b:Ld37;

    .line 791
    .line 792
    invoke-virtual {v0}, Ld37;->getValue()Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v2

    .line 796
    check-cast v2, Ljava/lang/Iterable;

    .line 797
    .line 798
    new-instance v3, Ljava/util/ArrayList;

    .line 799
    .line 800
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 801
    .line 802
    .line 803
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 804
    .line 805
    .line 806
    move-result-object v2

    .line 807
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 808
    .line 809
    .line 810
    move-result v4

    .line 811
    if-eqz v4, :cond_d

    .line 812
    .line 813
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v4

    .line 817
    move-object v5, v4

    .line 818
    check-cast v5, Lzs4;

    .line 819
    .line 820
    invoke-static {v5, p0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v5

    .line 824
    if-eqz v5, :cond_c

    .line 825
    .line 826
    goto :goto_8

    .line 827
    :cond_c
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    goto :goto_7

    .line 831
    :catchall_2
    move-exception v0

    .line 832
    move-object p0, v0

    .line 833
    goto :goto_9

    .line 834
    :cond_d
    :goto_8
    invoke-virtual {v0, v6, v3}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 835
    .line 836
    .line 837
    monitor-exit v1

    .line 838
    sget-object p0, Lvs7;->a:Lvs7;

    .line 839
    .line 840
    return-object p0

    .line 841
    :goto_9
    monitor-exit v1

    .line 842
    throw p0

    .line 843
    :pswitch_16
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast v0, Lsr2;

    .line 846
    .line 847
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 848
    .line 849
    check-cast p0, Lsr2;

    .line 850
    .line 851
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    sget-object p0, Lvs7;->a:Lvs7;

    .line 858
    .line 859
    return-object p0

    .line 860
    :pswitch_17
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 861
    .line 862
    check-cast v0, Landroid/content/Context;

    .line 863
    .line 864
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast p0, Laq4;

    .line 867
    .line 868
    new-instance v1, Landroid/content/Intent;

    .line 869
    .line 870
    const-class v2, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;

    .line 871
    .line 872
    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 873
    .line 874
    .line 875
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object p0

    .line 879
    check-cast p0, Ljava/lang/Boolean;

    .line 880
    .line 881
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 882
    .line 883
    .line 884
    move-result p0

    .line 885
    if-eqz p0, :cond_e

    .line 886
    .line 887
    invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 888
    .line 889
    .line 890
    goto :goto_a

    .line 891
    :cond_e
    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 892
    .line 893
    .line 894
    move-result p0

    .line 895
    if-eqz p0, :cond_f

    .line 896
    .line 897
    invoke-static {v0, v1}, Lag8;->H(Landroid/content/Context;Landroid/content/Intent;)V

    .line 898
    .line 899
    .line 900
    goto :goto_a

    .line 901
    :cond_f
    new-instance p0, Landroid/content/Intent;

    .line 902
    .line 903
    const-string v1, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    .line 904
    .line 905
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v2

    .line 909
    new-instance v3, Ljava/lang/StringBuilder;

    .line 910
    .line 911
    const-string v4, "package:"

    .line 912
    .line 913
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 914
    .line 915
    .line 916
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 917
    .line 918
    .line 919
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v2

    .line 923
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    invoke-direct {p0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 928
    .line 929
    .line 930
    const/high16 v1, 0x10000000

    .line 931
    .line 932
    invoke-virtual {p0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 933
    .line 934
    .line 935
    move-result-object p0

    .line 936
    invoke-virtual {v0, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 937
    .line 938
    .line 939
    :goto_a
    sget-object p0, Lvs7;->a:Lvs7;

    .line 940
    .line 941
    return-object p0

    .line 942
    :pswitch_18
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 943
    .line 944
    check-cast v0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;

    .line 945
    .line 946
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast p0, Landroid/view/WindowManager$LayoutParams;

    .line 949
    .line 950
    sget-object v1, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->K:Ld37;

    .line 951
    .line 952
    iget p0, p0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 953
    .line 954
    int-to-float p0, p0

    .line 955
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 956
    .line 957
    .line 958
    move-result-object v1

    .line 959
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 964
    .line 965
    int-to-float v1, v1

    .line 966
    mul-float/2addr v1, v2

    .line 967
    cmpl-float p0, p0, v1

    .line 968
    .line 969
    if-ltz p0, :cond_10

    .line 970
    .line 971
    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    .line 972
    .line 973
    .line 974
    goto :goto_b

    .line 975
    :cond_10
    iget-object p0, v0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->J:Ld37;

    .line 976
    .line 977
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 978
    .line 979
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 980
    .line 981
    .line 982
    invoke-virtual {p0, v6, v0}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 983
    .line 984
    .line 985
    :goto_b
    sget-object p0, Lvs7;->a:Lvs7;

    .line 986
    .line 987
    return-object p0

    .line 988
    :pswitch_19
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast v0, Lre6;

    .line 991
    .line 992
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 993
    .line 994
    check-cast p0, Loe6;

    .line 995
    .line 996
    new-instance v1, Lx34;

    .line 997
    .line 998
    sget-object v2, Lb42;->w:Lb42;

    .line 999
    .line 1000
    invoke-direct {v1, v0, v2, p0}, Lx34;-><init>(Lre6;Ljava/util/Map;Loe6;)V

    .line 1001
    .line 1002
    .line 1003
    return-object v1

    .line 1004
    :pswitch_1a
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 1005
    .line 1006
    check-cast v0, Loq1;

    .line 1007
    .line 1008
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 1009
    .line 1010
    check-cast p0, Lob5;

    .line 1011
    .line 1012
    invoke-virtual {v0}, Loq1;->getValue()Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    check-cast v0, Lab5;

    .line 1017
    .line 1018
    new-instance v1, Lig;

    .line 1019
    .line 1020
    iget-object v2, p0, Lob5;->d:Lge1;

    .line 1021
    .line 1022
    iget-object v2, v2, Lge1;->B:Ljava/lang/Object;

    .line 1023
    .line 1024
    check-cast v2, Ll24;

    .line 1025
    .line 1026
    invoke-virtual {v2}, Ll24;->getValue()Ljava/lang/Object;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v2

    .line 1030
    check-cast v2, Lre3;

    .line 1031
    .line 1032
    invoke-direct {v1, v2, v0}, Lig;-><init>(Lre3;Luq3;)V

    .line 1033
    .line 1034
    .line 1035
    new-instance v2, Lbb5;

    .line 1036
    .line 1037
    invoke-direct {v2, p0, v0, v1}, Lbb5;-><init>(Lob5;Lab5;Lig;)V

    .line 1038
    .line 1039
    .line 1040
    return-object v2

    .line 1041
    :pswitch_1b
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 1042
    .line 1043
    check-cast v0, Loq1;

    .line 1044
    .line 1045
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 1046
    .line 1047
    check-cast p0, Ln04;

    .line 1048
    .line 1049
    invoke-virtual {v0}, Loq1;->getValue()Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    check-cast v0, Lvz3;

    .line 1054
    .line 1055
    new-instance v1, Lig;

    .line 1056
    .line 1057
    iget-object v2, p0, Ln04;->d:Lg04;

    .line 1058
    .line 1059
    iget-object v2, v2, Lg04;->f:Ll24;

    .line 1060
    .line 1061
    invoke-virtual {v2}, Ll24;->getValue()Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v2

    .line 1065
    check-cast v2, Lre3;

    .line 1066
    .line 1067
    invoke-direct {v1, v2, v0}, Lig;-><init>(Lre3;Luq3;)V

    .line 1068
    .line 1069
    .line 1070
    new-instance v2, Lwz3;

    .line 1071
    .line 1072
    invoke-direct {v2, p0, v0, v1}, Lwz3;-><init>(Ln04;Lvz3;Lig;)V

    .line 1073
    .line 1074
    .line 1075
    return-object v2

    .line 1076
    :pswitch_1c
    iget-object v0, p0, Lqm3;->x:Ljava/lang/Object;

    .line 1077
    .line 1078
    check-cast v0, Lll6;

    .line 1079
    .line 1080
    iget-object p0, p0, Lqm3;->y:Ljava/lang/Object;

    .line 1081
    .line 1082
    check-cast p0, Lpl3;

    .line 1083
    .line 1084
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 1085
    .line 1086
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1087
    .line 1088
    .line 1089
    iget-object v3, p0, Lpl3;->a:Lwl3;

    .line 1090
    .line 1091
    invoke-static {p0, v0}, Lrm3;->d(Lpl3;Lll6;)V

    .line 1092
    .line 1093
    .line 1094
    invoke-interface {v0}, Lll6;->e()I

    .line 1095
    .line 1096
    .line 1097
    move-result p0

    .line 1098
    move v3, v5

    .line 1099
    :goto_c
    if-ge v3, p0, :cond_16

    .line 1100
    .line 1101
    invoke-interface {v0, v3}, Lll6;->g(I)Ljava/util/List;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v4

    .line 1105
    new-instance v7, Ljava/util/ArrayList;

    .line 1106
    .line 1107
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1108
    .line 1109
    .line 1110
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v4

    .line 1114
    :cond_11
    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1115
    .line 1116
    .line 1117
    move-result v8

    .line 1118
    if-eqz v8, :cond_12

    .line 1119
    .line 1120
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v8

    .line 1124
    instance-of v9, v8, Lpm3;

    .line 1125
    .line 1126
    if-eqz v9, :cond_11

    .line 1127
    .line 1128
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1129
    .line 1130
    .line 1131
    goto :goto_d

    .line 1132
    :cond_12
    invoke-static {v7}, Ldt0;->S0(Ljava/util/List;)Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v4

    .line 1136
    check-cast v4, Lpm3;

    .line 1137
    .line 1138
    if-eqz v4, :cond_15

    .line 1139
    .line 1140
    invoke-interface {v4}, Lpm3;->names()[Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v4

    .line 1144
    if-eqz v4, :cond_15

    .line 1145
    .line 1146
    array-length v7, v4

    .line 1147
    move v8, v5

    .line 1148
    :goto_e
    if-ge v8, v7, :cond_15

    .line 1149
    .line 1150
    aget-object v9, v4, v8

    .line 1151
    .line 1152
    invoke-interface {v0}, Lll6;->u()Ln85;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v10

    .line 1156
    sget-object v11, Lql6;->l:Lql6;

    .line 1157
    .line 1158
    invoke-static {v10, v11}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1159
    .line 1160
    .line 1161
    move-result v10

    .line 1162
    if-eqz v10, :cond_13

    .line 1163
    .line 1164
    const-string v10, "enum value"

    .line 1165
    .line 1166
    goto :goto_f

    .line 1167
    :cond_13
    const-string v10, "property"

    .line 1168
    .line 1169
    :goto_f
    invoke-interface {v2, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1170
    .line 1171
    .line 1172
    move-result v11

    .line 1173
    if-nez v11, :cond_14

    .line 1174
    .line 1175
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v10

    .line 1179
    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1180
    .line 1181
    .line 1182
    add-int/lit8 v8, v8, 0x1

    .line 1183
    .line 1184
    goto :goto_e

    .line 1185
    :cond_14
    new-instance p0, Ljava/lang/StringBuilder;

    .line 1186
    .line 1187
    const-string v4, "The suggested name \'"

    .line 1188
    .line 1189
    invoke-direct {p0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual {p0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1193
    .line 1194
    .line 1195
    const-string v4, "\' for "

    .line 1196
    .line 1197
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {p0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1201
    .line 1202
    .line 1203
    const/16 v4, 0x20

    .line 1204
    .line 1205
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1206
    .line 1207
    .line 1208
    invoke-interface {v0, v3}, Lll6;->f(I)Ljava/lang/String;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v3

    .line 1212
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1213
    .line 1214
    .line 1215
    const-string v3, " is already one of the names for "

    .line 1216
    .line 1217
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual {p0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1224
    .line 1225
    .line 1226
    invoke-static {v9, v2}, Lsf4;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v2

    .line 1230
    check-cast v2, Ljava/lang/Number;

    .line 1231
    .line 1232
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1233
    .line 1234
    .line 1235
    move-result v2

    .line 1236
    invoke-interface {v0, v2}, Lll6;->f(I)Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v2

    .line 1240
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1241
    .line 1242
    .line 1243
    const-string v2, " in "

    .line 1244
    .line 1245
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1246
    .line 1247
    .line 1248
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1252
    .line 1253
    .line 1254
    move-result-object p0

    .line 1255
    new-instance v0, Lkotlinx/serialization/json/JsonDecodingException;

    .line 1256
    .line 1257
    invoke-static {v1, p0, v6, v6, v6}, Lar7;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object p0

    .line 1261
    invoke-direct {v0, p0}, Lkotlinx/serialization/json/JsonException;-><init>(Ljava/lang/String;)V

    .line 1262
    .line 1263
    .line 1264
    throw v0

    .line 1265
    :cond_15
    add-int/lit8 v3, v3, 0x1

    .line 1266
    .line 1267
    goto/16 :goto_c

    .line 1268
    .line 1269
    :cond_16
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 1270
    .line 1271
    .line 1272
    move-result p0

    .line 1273
    if-eqz p0, :cond_17

    .line 1274
    .line 1275
    sget-object v2, Lb42;->w:Lb42;

    .line 1276
    .line 1277
    :cond_17
    return-object v2

    .line 1278
    nop

    .line 1279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
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
