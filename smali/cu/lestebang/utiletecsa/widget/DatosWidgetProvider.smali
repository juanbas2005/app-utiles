.class public final Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;
.super Landroid/appwidget/AppWidgetProvider;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;",
        "Landroid/appwidget/AppWidgetProvider;",
        "<init>",
        "()V",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public volatile a:Z

.field public final b:Ljava/lang/Object;

.field public c:Lk40;

.field public d:Lh81;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;->a:Z

    .line 6
    .line 7
    new-instance v0, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;->b:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final a(Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;Landroid/content/Context;Lh61;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lej1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lej1;

    .line 7
    .line 8
    iget v1, v0, Lej1;->C:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lej1;->C:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lej1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lej1;-><init>(Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lej1;->A:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lej1;->C:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const-string v3, "balanceRepository"

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    sget-object v6, Lp81;->w:Lp81;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v5, :cond_2

    .line 39
    .line 40
    if-ne v1, v4, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, Lej1;->z:Landroid/content/Context;

    .line 43
    .line 44
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_2
    iget-object p1, v0, Lej1;->z:Landroid/content/Context;

    .line 55
    .line 56
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;->c:Lk40;

    .line 64
    .line 65
    if-eqz p2, :cond_9

    .line 66
    .line 67
    check-cast p2, Lc50;

    .line 68
    .line 69
    sget-object v1, Lxz7;->a:Lxz7;

    .line 70
    .line 71
    const-string v7, "datos"

    .line 72
    .line 73
    const-string v8, ""

    .line 74
    .line 75
    invoke-virtual {p2, v1, v7, v8}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    iput-object p1, v0, Lej1;->z:Landroid/content/Context;

    .line 80
    .line 81
    iput v5, v0, Lej1;->C:I

    .line 82
    .line 83
    invoke-static {p2, v0}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    if-ne p2, v6, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/CharSequence;

    .line 91
    .line 92
    invoke-static {p2}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_7

    .line 97
    .line 98
    iget-object p0, p0, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;->c:Lk40;

    .line 99
    .line 100
    if-eqz p0, :cond_6

    .line 101
    .line 102
    check-cast p0, Lc50;

    .line 103
    .line 104
    invoke-virtual {p0}, Lc50;->c()Ldi2;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    iput-object p1, v0, Lej1;->z:Landroid/content/Context;

    .line 109
    .line 110
    iput v4, v0, Lej1;->C:I

    .line 111
    .line 112
    invoke-static {p0, v0}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    if-ne p2, v6, :cond_5

    .line 117
    .line 118
    :goto_2
    return-object v6

    .line 119
    :cond_5
    move-object p0, p1

    .line 120
    :goto_3
    check-cast p2, Ljava/lang/String;

    .line 121
    .line 122
    move-object p1, p0

    .line 123
    goto :goto_4

    .line 124
    :cond_6
    invoke-static {v3}, Lsg3;->a0(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v2

    .line 128
    :cond_7
    :goto_4
    check-cast p2, Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    new-instance v0, Landroid/content/ComponentName;

    .line 135
    .line 136
    const-class v1, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;

    .line 137
    .line 138
    invoke-direct {v0, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v0}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    array-length v2, v0

    .line 149
    const/4 v3, 0x0

    .line 150
    move v4, v3

    .line 151
    :goto_5
    if-ge v4, v2, :cond_8

    .line 152
    .line 153
    aget v5, v0, v4

    .line 154
    .line 155
    new-instance v6, Landroid/widget/RemoteViews;

    .line 156
    .line 157
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    const v8, 0x7f0c007b

    .line 162
    .line 163
    .line 164
    invoke-direct {v6, v7, v8}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    const v7, 0x7f090246

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v7, p2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    new-instance v7, Landroid/content/Intent;

    .line 174
    .line 175
    invoke-direct {v7, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 176
    .line 177
    .line 178
    const-string v8, "cu.lestebang.utiletecsa.widget.DATOS_REFRESH"

    .line 179
    .line 180
    invoke-virtual {v7, v8}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    const/high16 v8, 0xc000000

    .line 185
    .line 186
    invoke-static {p1, v3, v7, v8}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    const v8, 0x7f090241

    .line 194
    .line 195
    .line 196
    invoke-virtual {v6, v8, v7}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, v5, v6}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    .line 200
    .line 201
    .line 202
    add-int/lit8 v4, v4, 0x1

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_8
    sget-object p0, Lvs7;->a:Lvs7;

    .line 206
    .line 207
    return-object p0

    .line 208
    :cond_9
    invoke-static {v3}, Lsg3;->a0(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw v2
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
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
.end method


# virtual methods
.method public final b(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;->b:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-boolean v1, p0, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;->a:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lb96;->u(Landroid/content/Context;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lfj1;

    .line 17
    .line 18
    check-cast v1, Lvd1;

    .line 19
    .line 20
    iget-object v1, v1, Lvd1;->s:Llu5;

    .line 21
    .line 22
    invoke-interface {v1}, Lmu5;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lk40;

    .line 27
    .line 28
    iput-object v1, p0, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;->c:Lk40;

    .line 29
    .line 30
    invoke-static {}, Lzv1;->a()Lh81;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;->d:Lh81;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    iput-boolean v1, p0, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;->a:Z

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    :goto_0
    monitor-exit v0

    .line 43
    goto :goto_2

    .line 44
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw p0

    .line 46
    :cond_1
    :goto_2
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 47
    .line 48
    .line 49
    return-void
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const-string v0, "cu.lestebang.utiletecsa.widget.DATOS_REFRESH"

    .line 15
    .line 16
    invoke-static {p2, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_2

    .line 21
    .line 22
    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance v0, Landroid/content/ComponentName;

    .line 27
    .line 28
    const-class v1, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;

    .line 29
    .line 30
    invoke-direct {v0, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Landroid/widget/RemoteViews;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const v3, 0x7f0c007b

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    const v2, 0x7f110465

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const v3, 0x7f090246

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v3, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v0}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    array-length v2, v0

    .line 66
    const/4 v3, 0x0

    .line 67
    :goto_0
    if-ge v3, v2, :cond_0

    .line 68
    .line 69
    aget v4, v0, v3

    .line 70
    .line 71
    invoke-virtual {p2, v4, v1}, Landroid/appwidget/AppWidgetManager;->partiallyUpdateAppWidget(ILandroid/widget/RemoteViews;)V

    .line 72
    .line 73
    .line 74
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-static {}, Lb85;->d()Lw77;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    iget-object v0, p0, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;->d:Lh81;

    .line 86
    .line 87
    const/4 v8, 0x0

    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    invoke-static {p2, v0}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-static {p2}, Lgl0;->E(Le81;)Lig0;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    new-instance v4, Ldj1;

    .line 99
    .line 100
    const/4 v9, 0x0

    .line 101
    move-object v5, p0

    .line 102
    move-object v6, p1

    .line 103
    invoke-direct/range {v4 .. v9}, Ldj1;-><init>(Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;Landroid/content/Context;Landroid/content/BroadcastReceiver$PendingResult;Lf61;I)V

    .line 104
    .line 105
    .line 106
    const/4 p0, 0x3

    .line 107
    invoke-static {p2, v8, v8, v4, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_1
    const-string p0, "ioDispatcher"

    .line 112
    .line 113
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v8

    .line 117
    :cond_2
    return-void
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method public final onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-static {}, Lb85;->d()Lw77;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-object p3, p0, Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;->d:Lh81;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    invoke-static {p2, p3}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-static {p2}, Lgl0;->E(Le81;)Lig0;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    new-instance v0, Ldj1;

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    move-object v1, p0

    .line 35
    move-object v2, p1

    .line 36
    invoke-direct/range {v0 .. v5}, Ldj1;-><init>(Lcu/lestebang/utiletecsa/widget/DatosWidgetProvider;Landroid/content/Context;Landroid/content/BroadcastReceiver$PendingResult;Lf61;I)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x3

    .line 40
    invoke-static {p2, v4, v4, v0, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    const-string p0, "ioDispatcher"

    .line 45
    .line 46
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v4
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
