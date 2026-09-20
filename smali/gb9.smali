.class public final synthetic Lgb9;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ldt;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lo00;


# direct methods
.method public synthetic constructor <init>(Lo00;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgb9;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lgb9;->b:Lo00;

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
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3

    .line 1
    iget v0, p0, Lgb9;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lgb9;->b:Lo00;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Landroid/net/Uri;

    .line 9
    .line 10
    const-string v0, ".bak"

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :try_start_0
    iget-object p0, p0, Lo00;->f:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lka9;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lka9;->b(Landroid/net/Uri;)Lia9;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v2, v1, Lia9;->a:Lza9;

    .line 45
    .line 46
    iget-object v1, v1, Lia9;->d:Landroid/net/Uri;

    .line 47
    .line 48
    invoke-interface {v2, v1}, Lza9;->b(Landroid/net/Uri;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lka9;->b(Landroid/net/Uri;)Lia9;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p0, p1}, Lka9;->b(Landroid/net/Uri;)Lia9;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget-object p1, v0, Lia9;->a:Lza9;

    .line 63
    .line 64
    iget-object v1, p0, Lia9;->a:Lza9;

    .line 65
    .line 66
    if-ne p1, v1, :cond_0

    .line 67
    .line 68
    iget-object v0, v0, Lia9;->d:Landroid/net/Uri;

    .line 69
    .line 70
    iget-object p0, p0, Lia9;->d:Landroid/net/Uri;

    .line 71
    .line 72
    invoke-interface {p1, v0, p0}, Lza9;->f(Landroid/net/Uri;Landroid/net/Uri;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    new-instance p0, Lcom/google/android/gms/internal/measurement/zzsk;

    .line 77
    .line 78
    const-string p1, "Cannot rename file across backends"

    .line 79
    .line 80
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    :catch_0
    move-exception p0

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    :goto_0
    sget-object p0, Lf93;->x:Lf93;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :goto_1
    invoke-static {p0}, Lpt2;->c(Ljava/lang/Exception;)Le93;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    :goto_2
    return-object p0

    .line 94
    :pswitch_0
    iget-object v0, p0, Lo00;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lcom/google/common/util/concurrent/ListenableFuture;

    .line 97
    .line 98
    invoke-static {v0}, Lpt2;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Landroid/net/Uri;

    .line 103
    .line 104
    invoke-virtual {p0, v0, p1}, Lo00;->m(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Lf93;->x:Lf93;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_1
    check-cast p1, Ljava/lang/Void;

    .line 111
    .line 112
    iget-object p1, p0, Lo00;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p1, Lcom/google/common/util/concurrent/ListenableFuture;

    .line 115
    .line 116
    invoke-static {p1}, Lpt2;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, Landroid/net/Uri;

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Lo00;->l(Landroid/net/Uri;)Lpk8;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, Lpt2;->d(Ljava/lang/Object;)Lf93;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    return-object p0

    .line 131
    :pswitch_2
    iget-object p1, p0, Lo00;->i:Ljava/lang/Object;

    .line 132
    .line 133
    monitor-enter p1

    .line 134
    :try_start_1
    iget-object p0, p0, Lo00;->k:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p0, Lcom/google/common/util/concurrent/ListenableFuture;

    .line 137
    .line 138
    monitor-exit p1

    .line 139
    return-object p0

    .line 140
    :catchall_0
    move-exception p0

    .line 141
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    throw p0

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method
