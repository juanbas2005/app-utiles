.class public final synthetic Lka;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lka;->w:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget p0, p0, Lka;->w:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Lfi0;->a:Lfi0;

    .line 7
    .line 8
    invoke-static {}, Lfi0;->a()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    sget-object p0, Lfi0;->a:Lfi0;

    .line 13
    .line 14
    invoke-static {}, Lfi0;->a()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    sget-object p0, Lje;->f1:Llp4;

    .line 19
    .line 20
    monitor-enter p0

    .line 21
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    iget-object v1, p0, Llp4;->a:[Ljava/lang/Object;

    .line 24
    .line 25
    iget v2, p0, Llp4;->b:I

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const/16 v4, 0x1e

    .line 29
    .line 30
    if-ge v0, v4, :cond_1

    .line 31
    .line 32
    :goto_0
    if-ge v3, v2, :cond_2

    .line 33
    .line 34
    :try_start_1
    aget-object v0, v1, v3

    .line 35
    .line 36
    check-cast v0, Lje;

    .line 37
    .line 38
    invoke-virtual {v0}, Lje;->getShowLayoutBounds()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    sget-object v5, Lje;->b1:Ld63;

    .line 43
    .line 44
    invoke-static {}, Ld63;->q()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-virtual {v0, v5}, Lje;->setShowLayoutBounds(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lje;->getShowLayoutBounds()Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eq v4, v5, :cond_0

    .line 56
    .line 57
    new-instance v4, Lud;

    .line 58
    .line 59
    const/4 v5, 0x2

    .line 60
    invoke-direct {v4, v0, v5}, Lud;-><init>(Lje;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto :goto_3

    .line 69
    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    :goto_2
    if-ge v3, v2, :cond_2

    .line 73
    .line 74
    aget-object v0, v1, v3

    .line 75
    .line 76
    check-cast v0, Lje;

    .line 77
    .line 78
    new-instance v4, Lud;

    .line 79
    .line 80
    const/4 v5, 0x3

    .line 81
    invoke-direct {v4, v0, v5}, Lud;-><init>(Lje;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    .line 86
    .line 87
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    monitor-exit p0

    .line 91
    return-void

    .line 92
    :goto_3
    monitor-exit p0

    .line 93
    throw v0

    .line 94
    :pswitch_2
    sget p0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AlarmManagerSchedulerBroadcastReceiver;->a:I

    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
